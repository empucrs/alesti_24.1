public class MinhaArrayList {
    private int []list;  // o arranjo que armazena os valores
    private int count;   // qtos valores estão salvos na lista.

    public MinhaArrayList() {
        list=new int[10];
        count=0;
    }

    public MinhaArrayList(int initialCapacity) {
        if (initialCapacity<=1)
            initialCapacity=10;

        list=new int[initialCapacity];
        count=0;
    }

    private void grow(){
        int [] novaLista = new int[list.length*2];
        for(int i=0; i<list.length; i++)
            novaLista[i]=list[i];
        list=novaLista;
    }

    public boolean	add(int element){
        if(count==list.length)
            grow();

        list[count]=element;
        count++;
        return true;
    }

    public void     add(int index, int element){
        if((index<0)||(index>=count))
            throw new IndexOutOfBoundsException("Posicao inválida na lista");

        if(count==list.length)
            grow();

        for(int i=count; i>index; i--)
            list[i]=list[i-1];
        list[index]=element;
        count++;
    }

    public void	    clear(){
        list=new int[10];
        count=0;
    }
    public boolean	contains(int element){
        for(int i=0; i<count; i++)
            if(list[i]==element) return true;
        
        return false;
    }

    public int 	    get(int index){
        if((index<0)||(index>=count))
            throw new IndexOutOfBoundsException("Posicao inválida na lista");
        return list[index];
    }

    public int	    indexOf(int element){
        for(int i=0; i<count; i++)        
            if(element==list[i]) return i;
        
        return -1;
    }

    public boolean	isEmpty(){
        return (count==0);
    }

    private void shrink(){
        int [] novaLista = new int[list.length/2];
        for(int i=0; i<list.length; i++)
            novaLista[i]=list[i];
        list=novaLista;
    }

    public int	    remove(int index){
        if((index<0)||(index>=count))
            throw new IndexOutOfBoundsException("Posicao inválida na lista");
        int value=list[index];
        for(int i=index; i<count; i++)
            list[i]=list[i+1];
        count--;
        if((list.length>10)&&(count<=((list.length/4)+1)))
            shrink();
        return value;
    }

    public int	    set(int index, int element){
        if((index<0)||(index>=count))
            throw new IndexOutOfBoundsException("Posicao inválida na lista");
        int aux=list[index];
        list[index]=element;
        return aux;
    }

    public int	    size(){
        return count;
    }

    public int	    capacity(){
        return list.length;
    }
}