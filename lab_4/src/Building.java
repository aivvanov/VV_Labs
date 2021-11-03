public class Building {
    private int noOfFloors;
    private int noOfElevator;

    public Building(int noOfElevator, int noOfFloors){
      this.noOfElevator = noOfElevator;
      this.noOfFloors = noOfFloors;
    }

    public int getNoOfFloors(){
        return noOfFloors;
    }
    public int getNoOfElevator(){
        return noOfElevator;
    }

}
