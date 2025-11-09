package tn.esprit.gestionzoo.entities;

public class Aquatic extends Animal implements Carnivore<Food> {
    protected String habitat;

    public Aquatic() {
        super(); // appel explicite au constructeur vide de Animal
    }

    // ✅ Constructeur avec paramètres
    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal); // appel du constructeur paramétré de Animal
        this.habitat = habitat;
    }

    public Aquatic(String habitat) {
    }

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("the animal is eating meat.");
        } else {
            System.out.println("this animal  cannot eat plants only!");
        }
    }

    @Override
    public String toString() {
        return "Aquatic{habitat='" + habitat + "'}";
    }

    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }


}