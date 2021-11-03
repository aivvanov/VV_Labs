public class Sandals extends FootWear{
    private boolean forSummer;

    public Sandals(boolean forSummer, boolean comfortable){
        super(comfortable);
        this.forSummer = forSummer;
    }
    public boolean isForSummer(){
        return forSummer;
    }
}
