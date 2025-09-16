
public class ZooManagement {

    public static void main(String[] args) {
        Zoo myZoo = new Zoo("Belvidere", "Tunis", 25);
        // Affichage via toString()
        System.out.println(myZoo);
        // appel displayZoo)
        myZoo.displayZoo();

        // Création d’un Animal
        Animal animal = new Animal("lion", "hebdomadaire", 5, true);
        System.out.println(animal);
        animal.displayAnimal();
    }
    }
