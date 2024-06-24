import java.util.ArrayList;
import java.util.List;

public class Zoologico <E extends Animal> {
    private List<E> listaDeAnimais;

    public Zoologico(){
        listaDeAnimais=new ArrayList<E>();
    }

    public boolean addAnimal(E animal){
        listaDeAnimais.add(animal);
        return true;
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        for(Animal a: listaDeAnimais){
            if(a instanceof Tigre)
                sb.append("Tigre; ");
            else if(a instanceof Elefante)
                sb.append("Elefante; ");
            else if(a instanceof Sapo)
                sb.append("Sapo; ");
            else if(a instanceof Mamifero)
                sb.append("Um mamífero qualquer; ");
            else if(a instanceof Anfibio)
                sb.append("Um Anfibio qualquer; ");
            else
                sb.append("Um Animal qualquer; ");
        }
        return sb.toString();
    }

    
    
}