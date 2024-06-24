public class Tigre extends Mamifero{
    private String Nome;
    private int nListras;

    public Tigre(int id, double p, int nMamas, String nome, int nListras) {        
        super(id, p, nMamas);
        this.Nome=nome;
        this.nListras=nListras;
    }

    public void setNome(String nome) {
        if(!nome.isEmpty())
            this.Nome = nome;
    }

    public void setnListras(int nListras) {
        if(nListras>=0)
            this.nListras = nListras;
    }

    public String getNome() {
        return Nome;
    }
    
    public int getnListras() {
        return nListras;
    }
}
