public class Anfibio extends Animal{

    private String habitat;

    public Anfibio(int id, double p, String habitat) {
        super(id, p);
        this.habitat=habitat;
    }

    public void setHabitat(String habitat) {
        if(! habitat.isEmpty())
            this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }
}
