import java.util.List;

public class Catalog {
    String name;
    List<Items> items;

    public Catalog(String name, List<Items> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public List<Items> getItems() {
        return items;
    }
}
