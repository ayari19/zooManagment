public class Zoo {
    String name;
    String city;
    int nbrCages;

    Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }


    public void displayZoo() {
        System.out.println("le Zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + nbrCages);   // appel implicite de toString()

    }
    @Override
    public String toString() {
        return "Zoo: " + name + ", Ville: " + city + ", Nombre de cages: " + nbrCages;
    }
}