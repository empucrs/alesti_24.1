public class MinhaDLinkedList {

    private class Nodo {
        public int valor;
        public Nodo prox;
        public Nodo prev;
        public Nodo(int v){
            valor=v;
            prev=prox=null;
        }
    }

    private Nodo head, tail;
    private int count;

    public MinhaDLinkedList(){
        tail=head=null;
        count=0;
    }

    public boolean	add(int element){
        Nodo novo = new Nodo(element);

        if(count==0)
            head=novo;
        else{
            tail.prox=novo;
            tail.prox.prev=tail;
        }
        tail=novo;
        count++;
        return true;
    }

    public void     add(int index, int element){
    }

    public void	    clear(){
        tail=head=null;
        count=0;
    }

    public boolean	contains(int element){
        Nodo aux = head;
        //for(Nodo aux=head; aux!=null; aux=aux.prox){}
        while (aux!=null){
            if(aux.valor==element) return true;
            aux=aux.prox;
        }
        return false;
    }

    public int 	    get(int index){
        return 0;
    }

    public int	    indexOf(int element){
        Nodo aux = head;
        int idx=0;
        while (aux!=null){
            if(aux.valor==element) return idx;
            aux=aux.prox;
            idx++;
        }
        return -1;
    }

    public boolean	isEmpty(){
        return (count==0);
    }

    public int	    remove(int index){
        return 0;
    }

    public int	    set(int index, int element){
        return 0;
    }

    public int	    size(){
        return count;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        if(! isEmpty()){
            Nodo navegador = head;
            while (navegador.prox!=null){
                sb.append(navegador.valor+", ");
                navegador=navegador.prox;
            }
            sb.append(navegador.valor+"");

        }
        sb.append("]");
        return sb.toString();
    }  

}