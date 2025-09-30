package tn.esprit.gestionzoo.entities;

public class Zoo {
    static final int NBR_CAGES = 25;   // constante
    Animal[] animals = new Animal[NBR_CAGES];
    protected String city;
    protected String name;
    protected int animalCount = 0;  // combien d’animaux déjà ajoutés

    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }
    public boolean isZooFull() {
        return animalCount == NBR_CAGES;
    }
    // Ajouter un animal unique
    public boolean addAnimal(Animal animal) {
        // Vérifier si déjà présent
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                System.out.println(" L’animal " + animal.name + " existe déjà !");
                return false;
            }
            if(isZooFull()){
                System.out.println("le zoo est plein");
            }
        }

        // Vérifier si zoo plein

        // Ajouter l’animal
        animals[animalCount] = animal;
        animalCount++;
        System.out.println(" L’animal " + animal.name + " a été ajouté au zoo !");
        return true;
    }
    // Afficher le zoo
    public void displayZoo() {
        System.out.println("tn.esprit.gestionzoo.entities.Zoo: " + name + " à " + city);
        System.out.println("Animaux présents (" + animalCount + "/" + NBR_CAGES + "):");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(" - " + animals[i]);
        }
    }

    // Chercher un animal
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1; // pas trouvé
    }

    // Supprimer un animal
    public boolean removeAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].name.equals(animal.name)) {
                // décaler les suivants
                for (int j = i; j < animalCount - 1; j++) {
                    animals[j] = animals[j + 1];
                }
                animals[animalCount - 1] = null;
                animalCount--;
                System.out.println(" L’animal " + animal.name + " a été supprimé !");
                return true;
            }
        }
        return false; // pas trouvé
    }


    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            System.out.println("Les deux zoos ont le même nombre d’animaux.");
            return null; // égalité
        }
    }
    //getter setter
    public void setName(String name){
        if(name==null){
            System.out.println("le nom ne doit pas etre vide ");
        }
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public void setAnimalCount(int animalCount) {
        this.animalCount = animalCount;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public static int getNbrCages() {
        return NBR_CAGES;
    }


    public String getCity() {
        return city;
    }
}
