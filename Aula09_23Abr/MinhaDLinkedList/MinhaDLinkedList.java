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
        if((index<0)||(index>=count))
            throw new IndexOutOfBoundsException("Indice invalido");

        Nodo navegador;        
        //ALTERNATIVA 1 - DO inicio para fim sempre    
        navegador=head;        
        while(index>0){
            navegador=navegador.prox;
            index--;
        }
        Nodo novo = new Nodo(element);

        if(navegador!=head){ // se não for o primeiro elemento
            novo.prev=navegador.prev;
            navegador.prev=novo;
            novo.prox=navegador;
            novo.prev.prox=novo;
        }
        else{
            novo.prox=head;
            head.prev=novo;
            head=novo;
        }

        count++;

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
        if((index<0)||(index>=count))
            throw new IndexOutOfBoundsException("Indice invalido");

        Nodo navegador;        
        //ALTERNATIVA 1 - DO inicio para fim sempre    
        /*
        navegador=head;        
        while(index>0){
            navegador=navegador.prox;
            index--;
        }
        */
        // ALTERNATIVA 2 - Inicio depende do indice
        int meio=count/2;
        if(index<meio){
            navegador=head;        
            while(index>0){
                navegador=navegador.prox;
                index--;
            }
        }
        else{
            navegador=tail;
            int idx=count-index-1;
            while(idx>0){
                navegador=navegador.prev;
                idx--;
            }
        }
        return navegador.valor;
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
        if((index<0)||(index>=count))
            throw new IndexOutOfBoundsException("Indice invalido");

        Nodo navegador=head;
        while (index>0) {
            navegador=navegador.prox;
            index--;            
        }

        if(navegador!=head)
            navegador.prev.prox=navegador.prox;
        else
            head=navegador.prox;

        if(navegador!=tail)
            navegador.prox.prev=navegador.prev;
        else
            tail=navegador.prev;

        navegador.prox=null;
        navegador.prev=null;

        count--;

        return navegador.valor;
    }

    public int	    set(int index, int element){
        if((index<0)||(index>=count))
            throw new IndexOutOfBoundsException("Indice invalido");

        Nodo navegador;        
        //ALTERNATIVA 1 - DO inicio para fim sempre    
        navegador=head;        
        while(index>0){
            navegador=navegador.prox;
            index--;
        }
        int aux=navegador.valor;
        navegador.valor=element;
        return aux;
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

    public int somatorio(){
        int soma=0;
        Nodo navegador=head;
        while (navegador!=null) {
            soma+=navegador.valor;
            navegador=navegador.prox;
        }
        return soma;
    }

    public int maior(){
        if(count==0)
            throw new NullPointerException("A lista está vazia..");

        int maior=head.valor;
        Nodo navegador = head.prox;
        while (navegador!=null) {
            if(navegador.valor>maior)
                maior=navegador.valor;
            navegador=navegador.prox;
            
        }
        return maior;
    }

    public int lastIndexLowerThan(int value){
        if(count==0)
            return -1;

        int idx, aux;

        aux=-1;
        idx=0;

        Nodo navegador=head;
        while (navegador!=null) {
            if(navegador.valor<value)
                aux=idx;
            idx++;
            navegador=navegador.prox;            
        }

        return aux;
    }

}