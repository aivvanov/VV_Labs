import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Online_Store store = new Online_Store();
        Scanner sc = new Scanner(System.in);
        int input;
        do {
            if (store.currentUser == null) System.out.println("Press 0 If you have an account");
            else {
                System.out.println("Glad to see you, "+ store.currentUser.getLogin());
                System.out.println("Press 1 to get catalog");
                System.out.println("Press 2 to get basket");
                if (store.lastBoughtBasket != null) {
                    System.out.println("Press 3 to get last buy");
                }
            }
            input = sc.nextInt();
            switch (input) {
                case 0: {
                    System.out.println("Enter login, please");
                    String login = sc.next();
                    System.out.println("Enter password, please");
                    String pass = sc.next();
                    store.auth(login, pass);

                    break;
                }

                case 1: {
                    store.showCataloges();
                    int catalogId = sc.nextInt();
                    int itemId;
                    if (catalogId > 0) {
                        do {
                            System.out.println("Press 0 to get back");
                            store.showCatalogItems(catalogId-1);
                            System.out.println("Choose a product you want to buy or press 0 to get back ");
                            itemId = sc.nextInt();
                            if (itemId > 0) store.addToBasket(itemId-1, catalogId-1);
                        } while(itemId != 0);
                    }

                    break;
                }
                case 2: {
                    store.showCurrentBasket();
                    System.out.println("Press 0 to get back");
                    System.out.println("Press 1 to buy the goods you added to the basket");
                    int answer = sc.nextInt();
                    if (answer == 1) store.buyBasket();
                    break;
                }
                case 3: {
                    store.showLastBasket();
                    System.out.println("Press 0 to get back");
                    sc.nextInt();
                    break;
                }
            }
        } while (input != -1);
    }
}

