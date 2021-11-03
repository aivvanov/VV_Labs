public class Supermarket extends Building{
    private int noOfCashboxes;

    public Supermarket(int noOfFloors, int noOfElevator, int noOfCashboxes) {
        super(noOfElevator, noOfFloors);
        this.noOfCashboxes = noOfCashboxes;
    }

    public int getNoOfCashboxes(){
        return noOfCashboxes;
    }
}
