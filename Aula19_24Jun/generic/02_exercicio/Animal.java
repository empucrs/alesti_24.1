public class Animal {

    private int identificacao;
    private double peso;
    
    public Animal (int id, double p){
        identificacao=id;
        peso=p;
    }

    public void setIdentificacao(int identificacao) {
        this.identificacao = identificacao;
    }

    public void setPeso(double peso) {
        if(peso>0)
            this.peso = peso;
    }

    public int getIdentificacao() {
        return identificacao;
    }

    public double getPeso() {
        return peso;
    }
}