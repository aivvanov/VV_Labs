package Assets.Animals;

public class Horse extends Animal {
    private boolean isHorseShod;

    public Horse(String food, String location, boolean isHorseShod) {
        super(food, location);
        this.isHorseShod = isHorseShod;
    }

    public boolean getIsHorseShod() {
        return this.isHorseShod;
    }

    @Override
    public void makeNoise() {
        System.out.print("The horse is making noise");
        super.makeNoise();
    }

    @Override
    public void eat() {
        super.eat();
        System.out.print("The horse is eating");
    }
}
