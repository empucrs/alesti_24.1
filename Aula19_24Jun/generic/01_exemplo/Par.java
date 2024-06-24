import org.w3c.dom.Node;

public class Par<T, U>{
    private T componente1;
    private U  componente2;

    public Par (T c1, U c2){
        this.componente1=c1;
        this.componente2=c2;
    }

    public boolean add(T element){
        v[coutn]=element;        
    }
    public T get(int idx){
        return v[idx];
    }

    public static void main(String[] args) {

        Par<Integer, String> p1 = new Par<Integer, String>(1,"teste");        
        Par<Double, Node> p2 = new Par<Double,Node>(1.2, new Node());
        
    }
}

