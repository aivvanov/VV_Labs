import java.util.List;

public class main {
    public static void main(String[] args){
        List<Food> foods = List.of(
                new Soup(1500),
                new Salad(1000),
                new Starter(1200),
                new MainDish(2400)
        );
        System.out.println("calories is " + foods);
    }
}
