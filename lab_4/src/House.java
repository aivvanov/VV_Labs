public class House extends Building{
    private boolean huge;

    public House(boolean huge, int noOfElevator, int noOfFloors) {
        super(noOfElevator, noOfFloors);
        this.huge = huge;
    }

    public boolean isHuge(){
        return huge;
    }
}
