public class Animal {
    String family;
    String name;
    int age;
    Boolean isMammal;

    Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }
    public void displayAnimal(){
        System.out.println("animal: " + name + "  famille: " + family  + "son age"+ age + "is mammal"+ isMammal);

    }
    @Override
    public String toString() {
        return "l'animal: " + name + " et de   famille: " + family +  "est son age" + age +   "is mammal"+ isMammal;
    }
}
