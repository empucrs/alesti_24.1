public class Sapo extends Anfibio {

    private boolean venenoso;

    public Sapo(int id, double p, String habitat, boolean venenoso) {
        super(id, p, habitat);
        this.venenoso=venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public boolean getVenenoso() {
        return venenoso;
    }

    
}