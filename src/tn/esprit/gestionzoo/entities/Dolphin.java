package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatique {
    public Dolphin(String family, String name, int age, boolean isMammal,String habit,float swimmingSpeed) {
        super(family, name, age, isMammal,habit);
    }
    protected float swimmingSpeed;
    @Override
    public void swim() {
        System.out.println("This dolphin is swimming.");
    }


}