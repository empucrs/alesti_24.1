public class Principal {
    public static void main(String[] args) {
        MinhaLinkedList mll = new MinhaLinkedList();
        System.out.println(mll);

        mll.add(7);
        System.out.println(mll);
        System.out.println("size: "+mll.size());

        mll.add(3);
        System.out.println(mll);
        System.out.println("size: "+mll.size());

        mll.add(17);
        System.out.println(mll);
        System.out.println("size: "+mll.size());

        mll.add(27);
        System.out.println(mll);
        System.out.println("size: "+mll.size());

        mll.add(4);
        System.out.println(mll);
        System.out.println("size: "+mll.size());

        mll.add(11);
        System.out.println(mll);
        System.out.println("size: "+mll.size());

        System.out.println("O valor 4 está na lista: "+mll.contains(4));
        System.out.println("O valor 77 está na lista: "+mll.contains(77));

        System.out.println("A posicao do valor 4 na lista é "+mll.indexOf(4));
        System.out.println("A posicao do valor 77 na lista é "+mll.indexOf(77));

        for(int i=0; i<mll.size(); i++)
            System.out.println("O conteudo "+i+" da lista é "+ mll.get(i));

        

        




    }
}
