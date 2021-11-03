public class Animal {
    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }

    public boolean isVegetarian(){
        return vegetarian;
    }
    public String getEats(){
        return eats;
    }
    public int getNoOfLegs(){
        return noOfLegs;
    }
}
