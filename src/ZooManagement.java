import java.awt.desktop.SystemEventListener;

public class ZooManagement {
    public static void main(String[] args) {
        Zoo myZoo = new Zoo("MyZoo", "Sousse");
        Zoo zoo1 = new Zoo("zootest", "tunis");
        Zoo zoo2 = new Zoo("belvidaire", "tunis");

        Animal lion = new Animal("Feline", "Lion", 5, true);
        Animal cheval = new Animal("Equide", "Cheval", 2, false);
        Animal tigre = new Animal("Feline", "Tigre", 4, true);
        Animal brebie = new Animal("Ovin", "Brebie", 3, true);
        Animal tigre1 = new Animal("Feline", "Tigre", 4, true);

        System.out.println(myZoo.addAnimal(lion));
        System.out.println(myZoo.addAnimal(cheval));
        System.out.println(myZoo.addAnimal(tigre));
        System.out.println(myZoo.addAnimal(tigre1));
        System.out.println( myZoo.addAnimal(tigre1)); // existe deja
        System .out.println(myZoo.removeAnimal(tigre1));
        System.out.println("Zoo plein ? " + myZoo.isZooFull());

        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        Zoo plusGrand = Zoo.compareZoo(zoo1, zoo2);

        if (plusGrand != null) {
            System.out.println(" Le zoo avec le plus d’animaux est : " + plusGrand.name);
        }
        /*myZoo.displayZoo();*/
    }
}
