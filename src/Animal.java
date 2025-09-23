public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal; // bool primitif (pas Boolean)

    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

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
}
