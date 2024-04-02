public class MinhaFila{
    int vetor[];
    int ultimo;

    public MinhaFila(){
        vetor = new int [10];
        ultimo=-1;
    }

    public void enqueue(int e) throws Exception{
        if(ultimo==vetor.length-1)
            throw new Exception("A fila está cheia.");
        ultimo++;
        vetor[ultimo]=e;
    }

    public int dequeue() throws Exception{
        if(ultimo==-1)        
            throw new Exception("A fila está vazia, meu chapa");
        int aux=vetor[0];
        for(int i=0; i<ultimo; i++)
            vetor[i]=vetor[i+1];
        ultimo--;
        return aux;
    }
    public int head() throws Exception{
        if(ultimo==-1)
            throw new Exception("A fila está vazia, meu chapa");
        return vetor[0];
    }
    public int size(){        
        return ultimo+1;
    }
    public boolean isEmpty(){
        return (ultimo==-1);
    }
    public void clear(){
        ultimo=-1;    
    }

}