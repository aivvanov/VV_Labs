package Assets.Animals;

public class Dog extends Animal {
    private String breed;

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    @Override
    public void makeNoise() {
        super.makeNoise();
        System.out.print("Wof, wof");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.print("The dog is eating");
    }
}
