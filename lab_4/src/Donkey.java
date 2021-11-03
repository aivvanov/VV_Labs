public class Donkey extends Horse{
    private boolean hasAname;

    public Donkey(boolean hasAname, boolean hasAtail){
        super(hasAtail);
        this.hasAname = hasAname;
    }
    public boolean isHasAname(){
        return hasAname;
    }
}
