public class Trainers extends FootWear{
    private int cost;

    public Trainers(int cost, boolean comfortable){
        super(comfortable);
        this.cost = cost;
    }
    public int getCost(){
        return cost;
    }
}
