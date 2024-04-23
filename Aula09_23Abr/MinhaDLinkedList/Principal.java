public class Principal {
    public static void main(String[] args) {
        MinhaDLinkedList mll = new MinhaDLinkedList();
        mll.add(1);
        mll.add(2);
        mll.add(3);
        mll.add(4);
        mll.add(5);

        System.out.println("a soma dos valores eh "+mll.somatorio());
        System.out.println("o maior valor eh "+mll.maior());

//        mll.clear();
//        System.out.println("o maior valor eh "+mll.maior());
        System.out.println("o ultimo idx eh "+mll.lastIndexLowerThan(15));
        System.out.println("o ultimo idx eh "+mll.lastIndexLowerThan(5));
        System.out.println("o ultimo idx eh "+mll.lastIndexLowerThan(4));
        System.out.println("o ultimo idx eh "+mll.lastIndexLowerThan(3));
        System.out.println("o ultimo idx eh "+mll.lastIndexLowerThan(2));
        System.out.println("o ultimo idx eh "+mll.lastIndexLowerThan(1));
        System.out.println("o ultimo idx eh "+mll.lastIndexLowerThan(0));

    }
}
