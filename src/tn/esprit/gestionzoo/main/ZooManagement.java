package tn.esprit.gestionzoo.main;
import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) {
        // === Création des zoos ===
        Zoo myZoo = new Zoo("MyZoo", "Sousse");
        Zoo zoo1  = new Zoo("zootest", "tunis");
        Zoo zoo2  = new Zoo("belvidaire", "tunis");

        // === Création des animaux ===
        Animal lion   = new Animal("Feline", "Lion", 5, true);
        Animal cheval = new Animal("Equide", "Cheval", 2, false);
        Animal tigre  = new Animal("Feline", "Tigre", 4, true);
        Animal brebie = new Animal("Ovin", "Brebie", 3, true);
        Animal tigre1 = new Animal("Feline", "Tigre", 4, true);
        Animal luna   = new Animal("chat", "luna", 3, true);

        // === Aquatic (Carnivore) ===
        Aquatic shark = new Aquatic("Selachimorpha", "Shark", 12, false, "Ocean");
        System.out.println("=== Aquatic Test ===");
        shark.eatMeat(Food.MEAT);
        shark.eatMeat(Food.PLANTS);
        shark.swim();
        System.out.println(shark);
        System.out.println();

        // 🐧 Penguin (hérite de Aquatic)
        Penguin penguin = new Penguin("Spheniscidae", "Penguin", 5, true, "Antarctica", 20.5f);
        System.out.println("=== Penguin Test ===");
        penguin.eatMeat(Food.MEAT);
        penguin.swim();
        System.out.println(penguin);
        System.out.println();

        // 🦁 Terrestrial (Omnivore = Carnivore + Herbivore)
        Terrestrial bear = new Terrestrial("Ursidae", "Bear", 8, true, 4);
        System.out.println("=== Terrestrial Test ===");
        bear.eatMeat(Food.MEAT);
        bear.eatPlant(Food.PLANTS);
        bear.eatPlantAndMeat(Food.BOTH);
        System.out.println(bear);
        System.out.println();

        // === Autre Aquatic ===
        Aquatic dolphin = new Aquatic("Delphinidae", "Dolphin", 5, true, "Ocean");
        dolphin.eatMeat(Food.MEAT);
        dolphin.eatMeat(Food.PLANTS);
        dolphin.swim();

        // === Ajouts dans myZoo (avec gestion des exceptions) ===
        tryAddAndReport(myZoo, lion);
        tryAddAndReport(myZoo, cheval);
        tryAddAndReport(myZoo, tigre);
        tryAddAndReport(myZoo, brebie); // peut échouer si zoo plein

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
            zoo.addAnimal(animal); // peut lancer ZooFullException
        } catch (ZooFullException e) {
            System.err.println("❌ " + e.getMessage());
        } finally {
            System.out.println("Nombre d’animaux dans " + zoo.getName() + " : " + zoo.getAnimalCount());
            System.out.println("----");
        }
    }
}