package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {

    protected int nbrLegs;

    public Terrestrial() {
        super();
    }

    public Terrestrial(int nbrLegs) {
        super();
        this.nbrLegs = nbrLegs;
    }

    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Carnivore
    @Override
    public void eatMeat(Food food) {
        if (food == Food.MEAT || food == Food.BOTH) {
            System.out.println( " eats meat.");
        } else {
            System.out.println( " cannot live on plants only!");
        }
    }

    // Herbivore
    @Override
    public void eatPlant(Food food) {
        if (food == Food.PLANTS || food == Food.BOTH) {
            System.out.println(" eats plants.");
        } else {
            System.out.println( " cannot live on meat only!");
        }
    }

    // Omnivore
    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println(" eats both plants and meat.");
        } else if (food == Food.MEAT) {
            eatMeat(food);
        } else {
            eatPlant(food);
        }
    }


}
