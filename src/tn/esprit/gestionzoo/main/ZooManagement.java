package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.entities.ZooFullException;

public class ZooManagement {

    public static void main(String[] args) {
        Zoo myZoo = new Zoo("MyZoo", "Sousse");
        Zoo zoo1  = new Zoo("zootest", "tunis");
        Zoo zoo2  = new Zoo("belvidaire", "tunis");

        Animal lion   = new Animal("Feline", "Lion", 5, true);
        Animal cheval = new Animal("Equide", "Cheval", 2, false);
        Animal tigre  = new Animal("Feline", "Tigre", 4, true);
        Animal brebie = new Animal("Ovin", "Brebie", 3, true);
        Animal tigre1 = new Animal("Feline", "Tigre", 4, true);
        Animal luna   = new Animal("chat", "luna", 3, true);

        // === Ajouts dans myZoo (avec gestion des exceptions) ===
        tryAddAndReport(myZoo, lion);
        tryAddAndReport(myZoo, cheval);
        tryAddAndReport(myZoo, tigre);
        tryAddAndReport(myZoo, brebie); // ❌ zoo plein ici

        System.out.println(myZoo.removeAnimal(tigre1));
        System.out.println("Zoo plein ? " + myZoo.isZooFull());

        // === Ajouts dans zoo1 ===
        tryAddAndReport(zoo1, luna);
        tryAddAndReport(zoo1, lion);
        tryAddAndReport(zoo1, tigre);

        // === Comparaison des deux zoos ===
        Zoo plusGrand = Zoo.compareZoo(zoo1, zoo2);
        if (plusGrand != null) {
            System.out.println("🏆 Le zoo avec le plus d’animaux est : " + plusGrand.getName());
        }

        // Affichage du contenu de myZoo
        myZoo.displayZoo();
    }
    private static void tryAddAndReport(Zoo zoo, Animal animal) {
        try {
            zoo.addAnimal(animal); // addAnimal peut lancer ZooFullException
        } catch (ZooFullException e) {
            System.err.println("❌ " + e.getMessage());
        } finally {
            System.out.println("Nombre d’animaux dans " + zoo.getName() + " : " + zoo.getAnimalCount());
            System.out.println("----");
        }
    }
}
