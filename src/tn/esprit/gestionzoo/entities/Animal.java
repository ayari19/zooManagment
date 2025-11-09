package tn.esprit.gestionzoo.entities;

public class Animal {
    // ✅ Données privées (encapsulation)
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // ✅ Constructeur : valide l’âge via setAge()
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age);           // validation ici
        this.isMammal = isMammal;
    }

    public Animal() {

    }

    // ✅ Affichage simple
    public void displayAnimal() {
        System.out.println("Animal: " + name +
                ", famille: " + family +
                ", âge: " + age +
                ", mammifère: " + isMammal);
    }


    @Override
    public String toString() {
        return "Animal{name='" + name + "', family='" + family +
                "', age=" + age + ", isMammal=" + isMammal + "}";
    }

    // ===================== Getters / Setters =====================

    public int getAge() { return age; }

    public void setAge(int age) {
        if (age < 0) {
            throw new InvalidAgeException("L'âge ne doit pas être négatif");
        }
        this.age = age;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getFamily() { return family; }
    public void setFamily(String family) { this.family = family; }

    public boolean isMammal() { return isMammal; }
    public void setMammal(boolean mammal) { isMammal = mammal; }


}
