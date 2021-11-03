public class Boots extends FootWear{
    private boolean warm;

    public Boots(boolean warm, boolean comfortable){
        super(comfortable);
        this.warm = warm;
    }
    public boolean isWarm(){
        return warm;
    }
}
