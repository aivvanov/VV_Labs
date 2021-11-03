public class Zebra extends Horse{
    private int noOfStripes;

    public Zebra(int noOfStripes, boolean hasAtail){
        super(hasAtail);
        this.noOfStripes = noOfStripes;
    }

    public int getNoOfStripes(){
        return noOfStripes;
    }
}
