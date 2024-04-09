public class MinhaLinkedList {

    private class Nodo {
        public int valor;
        public Nodo prox;        
    }

    private Nodo head;
    private int count;

    public MinhaLinkedList(){
        head=null;
        count=0;
    }

    public boolean	add(int element){}

    public void     add(int index, int element){}

    public void	    clear(){
        head=null;
        count=0;
    }

    public boolean	contains(int element){}

    public int 	    get(int index){}

    public int	    indexOf(int element){}

    public boolean	isEmpty(){
        return (count==0);
    }

    public int	    remove(int index){}

    public int	    set(int index, int element){}

    public int	    size(){
        return count;
    }

}