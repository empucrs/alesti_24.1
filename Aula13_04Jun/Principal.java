public class Principal {

    public static void main(String[] args) {
        ArvoreGenerica ag = new ArvoreGenerica();
        // System.out.println(ag);

        ag.setRoot(0);
        // System.out.println(ag);

        try {
            ag.add(1, 0);
            ag.add(2, 0);
            ag.add(3, 0);

            ag.add(4, 1);
            ag.add(5, 1);
            ag.add(6, 1);

            ag.add(7, 6);
            ag.add(8, 6);

            ag.add(9, 3);
            ag.add(10, 3);
            ag.add(11, 3);

            System.out.println(ag);

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }

}
