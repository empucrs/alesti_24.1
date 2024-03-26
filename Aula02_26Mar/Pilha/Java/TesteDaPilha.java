public class TesteDaPilha{
    public static void main(String[] args) {
        MinhaPilha mp = new MinhaPilha();

        try {
            
        System.out.println("A pilha está vazia? "+ mp.isEmpty());
        mp.push(1);
        mp.push(2);
        mp.push(3);
        mp.push(4);
        System.out.println("A pilha está vazia? "+ mp.isEmpty());
        System.out.println("A pilha contem "+mp.size()+" elementos");
        System.out.println("O elemento no topo da pilha é "+mp.top());
        mp.pop();
        System.out.println("O elemento no topo da pilha é "+mp.top());
        mp.clear();
        System.out.println("A pilha está vazia? "+ mp.isEmpty());
    } catch (Exception e) {
        System.out.println(e);
    }

    }
}