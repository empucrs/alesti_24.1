public class Mamifero extends Animal{
    private int nMamas;

    public Mamifero(int id, double p, int nMamas) {
        super(id, p);
        this.nMamas=nMamas;
    }

    public void setnMamas(int nMamas) {
        if(nMamas>0)
            this.nMamas = nMamas;
    }

    public int getnMamas() {
        return nMamas;
    }

}
