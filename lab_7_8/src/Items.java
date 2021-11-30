import java.io.Serializable;

public class Items implements Serializable {
    String name;
    float price;
    String description;

    public Items(String name, float price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }


}
