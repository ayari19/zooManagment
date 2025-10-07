package tn.esprit.gestionzoo.entities;

import org.ietf.jgss.ChannelBinding;

public class Aquatique extends Animal {
        String habitat;

        public Aquatique(String family, String name, int age, boolean isMammal, String habitat) {
            super(family, name, age, isMammal);
            this.habitat = habitat; // ✅ affectation correcte de l’attribut de la classe
        }

    protected String habit;
    @Override
    public String toString() {
        return super.toString() + ", habit'" + habit + "'}";
    }
    public void swim() {
        System.out.println("This aquatic animal is swimming.");
    }





}

