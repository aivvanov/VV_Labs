public class Slippers extends FootWear{
    private boolean forMen;

    public Slippers(boolean forMen, boolean comfortable){
        super(comfortable);
        this.forMen = forMen;
    }
    public boolean isForMen(){
        return forMen;
    }
}
