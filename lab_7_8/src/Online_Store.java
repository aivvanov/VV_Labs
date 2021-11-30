import java.io.*;
import java.util.List;
import java.util.Map;

public class Online_Store {
    static Map<String, String> users = Map.of("User","123");
    static List<Catalog> cataloges = List.of(
            new Catalog("Apple", List.of(new Items("Iphone 13", 150000, "Apple A15 Bionic, 512 Gb, 12Mp"),
                    new Items("MacBook Pro", 300000, "Apple M1, True Tone"))),
            new Catalog("Samsung", List.of(
                    new Items("Galaxy Tab S6", 100000, "sAMOLED display, 64Gb, Android 13.0"),
                    new Items("Galaxy Tab S7", 110000, "sAMOLED display, 124Gb, Android 14.0"))
            )
    );
    User currentUser;
    Basket currentBasket;
    Basket lastBoughtBasket;

    public Online_Store(){
        this.currentUser = null;
        this.currentBasket = new Basket();
        this.lastBoughtBasket = loadLastBasket();
    }

    public User auth(String login, String pass) {
        this.currentUser = (users.containsKey(login) && users.get(login).equals(pass)) ? new User(login, pass) : new User();
        return currentUser;
    }

    public void showCataloges() {
        for (int i = 0; i<cataloges.size(); i++) {
            System.out.println((i+1)+". "+cataloges.get(i).getName());
        }
    }

    public void showCatalogItems(int catalogId) {
        List<Items> items = cataloges.get(catalogId).getItems();
        for (int i = 0; i<items.size(); i++) {
            Items item = items.get(i);
            System.out.println((i+1)+". "+item.getName() + " " + item.getPrice() + " Rub.\nDescription: " + item.getDescription());
        }

    }


    public void showCurrentBasket() {
        showBasket(currentBasket);
    }
    public void showBasket(Basket basket) {
        List<Items> basketItems = basket.getItems();
        System.out.println("Your last buy: ");
        basketItems.forEach(item -> System.out.println(item.getName() + " - " + item.getPrice()));
        System.out.println("--------------------------------------");
        System.out.println("Cost: " + basket.getTotalPrice());
    }

    public void showLastBasket() {
        showBasket(lastBoughtBasket);
    }

    public void buyBasket() {
        System.out.println("You have bought " + currentBasket.getTotalPrice() +" Rub.");
        saveCheckToFile(currentBasket);
        serializeLastBasket(currentBasket);
        lastBoughtBasket = currentBasket;
        currentBasket = new Basket();
    }

    public Basket loadLastBasket() {
        File cartObjFile = new File("./basket.bin");
        try {
            try (FileInputStream fIn = new FileInputStream(cartObjFile)) {
                ObjectInputStream oos = new ObjectInputStream(fIn);
                return (Basket) oos.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {} catch (IOException e) {}
        return null;
    }
    public void serializeLastBasket(Basket cart) {
        File cartObjFile = new File("./basket.bin");
        try {
            try (FileOutputStream fOut = new FileOutputStream(cartObjFile)) {
                ObjectOutputStream oos = new ObjectOutputStream(fOut);
                oos.writeObject(cart);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void saveCheckToFile(Basket basket) {
        File cartFile = new File("./last_buy.txt");
        try (PrintWriter pw = new PrintWriter(cartFile)) {
            pw.println("Goods: ");
            for (Items item : basket.getItems())
                pw.println(item.getName() + " - " + item.getPrice() + " руб.");
            pw.println("-------------");
            pw.println("Price: " + basket.getTotalPrice() + " руб.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void addToBasket(int itemId, int catalogId) {
        currentBasket.add(cataloges.get(catalogId).getItems().get(itemId));
    }
}
