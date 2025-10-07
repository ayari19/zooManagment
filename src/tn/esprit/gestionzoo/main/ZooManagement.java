package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("MyZoo", "Sousse");
        Zoo zoo1 = new Zoo("zootest", "tunis");
        Zoo zoo2 = new Zoo("belvidaire", "tunis");

        Animal lion   = new Animal("Feline", "Lion", 5, true);
        Animal cheval = new Animal("Equide", "Cheval", 2, false);
        Animal tigre  = new Animal("Feline", "Tigre", 4, true);
        Animal brebie = new Animal("Ovin", "Brebie", 3, true);
        Animal tigre1 = new Animal("Feline", "Tigre", 4, true);
        Animal luna   = new Animal("chat", "luna", 3, true);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(cheval));
        System.out.println(myZoo.addAnimal(tigre));
        System.out.println(myZoo.addAnimal(tigre1));
        System.out.println(myZoo.addAnimal(tigre1)); // existe déjà
        System.out.println(myZoo.removeAnimal(tigre1));
        System.out.println("Zoo plein ? " + myZoo.isZooFull());

        zoo1.addAnimal(luna);
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);

        Zoo plusGrand = Zoo.compareZoo(zoo1, zoo2);
        if (plusGrand != null) {
            System.out.println("Le zoo avec le plus d’animaux est : " + plusGrand.getName());
        }

        // ====== Tes nouvelles instances ICI (toujours dans main) ======
        Terrestre chat = new Terrestre("Fifa", "chat", 5, true, 4);
        System.out.println(chat);
        Aquatique a1 = new Aquatique("FishFamily", "Poisson", 1, false,"mer");

        Dolphin d1 = new Dolphin("Delphinidae", "Flipper", 5, true, "Ocean", 25.5f);
        Penguin p1 = new Penguin("Spheniscidae", "Pingu", 3, false, "Antarctique", 10.2f);

        System.out.println(d1);
        System.out.println(p1);
        // ==============================================================
        a1.swim();
        d1.swim();
        p1.swim();
    }
}
