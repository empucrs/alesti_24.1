public class App {

    public static void main(String[] args) {
        Zoologico<Animal> zoo = new Zoologico<Animal>();

        zoo.addAnimal(new Tigre(0, 0, 0, null, 0));
        zoo.addAnimal(new Elefante(0, 0, 0, null, 0));
        zoo.addAnimal(new Sapo(0, 0, null, false));
        zoo.addAnimal(new Mamifero(0, 0, 0));
        zoo.addAnimal(new Anfibio(0, 0, null));
        zoo.addAnimal(new Animal(0, 0));

        System.out.println(zoo);

    }

    
}