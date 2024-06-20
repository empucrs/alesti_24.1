public class App {

    public static void main(String[] args) {
        ArvoreBinariaDePesquisa abp = new ArvoreBinariaDePesquisa();
        abp.add(8);
        abp.add(2);
        abp.add(10);
        abp.add(6);
        abp.add(5);
        abp.add(15);
        abp.add(7);
        abp.add(3);
        abp.add(20);
        abp.add(11);

        System.out.println(abp);

        System.out.println("O elemento 15 está na árvore? "+(abp.contains(15)));
        System.out.println("O elemento 11 está na árvore? "+(abp.contains(11)));
        System.out.println("O elemento 14 está na árvore? "+(abp.contains(14)));

    }
    
}
