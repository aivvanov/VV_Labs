import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Basket implements Serializable {
    List<Items> items;

    public Basket() {
        this.items = new ArrayList<>();
    }

    public double getTotalPrice() {
        return items.stream().mapToDouble(Items::getPrice).sum();
    }

    public List<Items> getItems() {
        return items;
    }

    public void add(Items item) {
        items.add(item);
    }
}
