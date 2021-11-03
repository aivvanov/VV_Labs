public class Pegasus extends Horse{
    private boolean real;

    public Pegasus(boolean real, boolean hasAtail){
        super(hasAtail);
        this.real = real;
    }

    public boolean isReal(){
        return real;
    }
}
