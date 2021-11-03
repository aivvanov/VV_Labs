public class Library extends Building{
    private int noOfExits;

    public Library(int noOfFloors, int noOfElevator, int noOfExits) {
        super(noOfElevator, noOfFloors);
        this.noOfExits = noOfExits;
    }

    public int getNoOfExits(){
        return noOfExits;
    }
}
