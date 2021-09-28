package Assets.Animals;

public class Animal {
    private String food;
    private String location;

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return this.food;
    }

    public String getLocation() {
        return this.location;
    }

    public void makeNoise() {
        System.out.println("!!!");
    }

    public void eat() {
        System.out.println("!!!");
    }

    public void sleep() {
        System.out.println("The animal is sleeping");
    }
}
