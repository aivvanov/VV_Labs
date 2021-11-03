public class HighShoes extends FootWear{
    private boolean forSkate;

    public HighShoes(boolean forSkate, boolean comfortable){
        super(comfortable);
        this.forSkate = forSkate;
    }
    public boolean isForSkate(){
        return forSkate;
    }
}
