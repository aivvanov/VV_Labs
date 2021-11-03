public class Shoes extends FootWear{
    private int size;

    public Shoes(int size, boolean comfortable){
        super(comfortable);
        this.size = size;
    }
    public int getSize(){
        return size;
    }
}
