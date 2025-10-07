package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatique{
    protected float swimmingDepth;

    public Penguin(String family, String name, int age, boolean isMammal,String habit,float swimmingDepth) {
        super(family, name, age, isMammal,habit);
        this.swimmingDepth=swimmingDepth;
    }
    @Override
    public String toString() {
        return super.toString() + ", habit='" + habit +"SwimingPath"+swimmingDepth;};
    }


