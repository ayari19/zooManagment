package tn.esprit.gestionzoo.entities;

public class Animal {
    protected String family;
    protected String name;
    protected int age;
    protected boolean isMammal; // bool primitif (pas Boolean)

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    public void displayAnimal() {
        System.out.println("tn.esprit.gestionzoo.entities.Animal: " + name +
                ", famille: " + family +
                ", âge: " + age +
                ", mammifère: " + isMammal);
    }


    @Override
    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{name='" + name + "', family='" + family +
                "', age=" + age + ", isMammal=" + isMammal + "}";
    }
    //getter et setter
    public void setAge(int age){
        if(age<0){
            System.out.println("l'age ne doit pas etre negartive");
        }
        this.age=age;
    }
    public int getAge(){
        return this.age;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setFamily(String Family){
        this.family=Family;
    }
    public String getFamily(){
        return this.family;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public boolean isMammal() {
        return isMammal;
    }
}
