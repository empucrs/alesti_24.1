public class TesteDaFila{
    public static void main(String[] args) {
        MinhaFila mp = new MinhaFila();

        try {
            
        System.out.println("A fila está vazia? "+ mp.isEmpty());
        mp.enqueue(1);
        mp.enqueue(2);
        mp.enqueue(3);
        mp.enqueue(4);
        System.out.println("A fila está vazia? "+ mp.isEmpty());
        System.out.println("A fila contem "+mp.size()+" elementos");
        System.out.println("O elemento na frente da fila é "+mp.head());
        mp.dequeue();
        System.out.println("O elemento na frente da fila é "+mp.head());
        mp.clear();
        System.out.println("A fila está vazia? "+ mp.isEmpty());
    } catch (Exception e) {
        System.out.println(e);
    }

    }
}