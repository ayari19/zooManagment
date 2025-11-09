package tn.esprit.gestionzoo.entities;

public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() {}

    public Penguin(String habitat, float swimmingDepth) {
        super(habitat);
        this.swimmingDepth = swimmingDepth;
    }

    public Penguin(String spheniscidae, String penguin, int i, boolean b, String antarctica, float v) {
    }

    @Override
    public String toString() {
        return "Penguin{habitat='" + habitat + "', swimmingDepth=" + swimmingDepth + "}";
    }

}