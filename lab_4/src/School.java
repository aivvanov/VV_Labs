public class School extends Building{
    private boolean HighScool;

    public School(int noOfFloors, int noOfElevator, boolean HighScool) {
        super(noOfElevator, noOfFloors);
        this.HighScool = HighScool;
    }

    public boolean isHighScool(){
        return HighScool;
    }
}
