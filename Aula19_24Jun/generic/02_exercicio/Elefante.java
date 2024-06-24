public class Elefante extends Mamifero{

    private String nome;
    private double tamanhoDaTromba;

    public Elefante(int id, double p, int nMamas, String nome, double tromba) {
        super(id, p, nMamas);
        this.nome=nome;
        this.tamanhoDaTromba=tromba;
    }

    public void setNome(String nome) {
        if(! nome.isEmpty())
            this.nome = nome;
    }

    public void setTamanhoDaTromba(double tamanhoDaTromba) {
        if(tamanhoDaTromba>0)
            this.tamanhoDaTromba = tamanhoDaTromba;
    }

    public String getNome() {
        return nome;
    }

    public double getTamanhoDaTromba() {
        return tamanhoDaTromba;
    }   
    
}
