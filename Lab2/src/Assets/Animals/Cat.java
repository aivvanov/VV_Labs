package Assets.Animals;

public class Cat extends Animal {
    private String eyeColor;

    public Cat(String food, String location, String eyeColor) {
        super(food, location);
        this.eyeColor = eyeColor;
    }

    public String getEyeColor() {
        return this.eyeColor;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.print("Meow, meow");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.print("The cat is eating");
    }
}
