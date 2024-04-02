import java.io.EOFException;

public class MinhaFilaCircular {

    int vetor[];
    int inicio, fim;

    public MinhaFilaCircular(){
        vetor = new int[10];
        inicio=0;
        fim=0;
    }

    public void enqueue(int e) throws Exception{        
        int proxFim = (fim+1)%vetor.length;
        if(proxFim==inicio)
            throw new Exception("A fila está cheia");
        vetor[fim]=e;
        fim=proxFim;
    }

    public int dequeue() throws Exception{
        if(inicio==fim)
            throw new Exception("A lista está vazia");
        int aux=vetor[inicio];
        inicio=(inicio+1)%vetor.length;
        return aux;
    }

    public int head() throws Exception{
        if(inicio==fim)
            throw new Exception("A lista está vazia");
        return vetor[inicio];
    }

    public int size(){ 
    }

    public boolean isEmpty(){
        return (inicio==fim);
    }
    public void clear(){
        inicio=0;
        fim=0;
    }


    
}