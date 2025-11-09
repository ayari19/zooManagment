package tn.esprit.gestionzoo.entities;

public class Zoo {

    // 🏗️ Constante : nombre maximum de cages
    private static final int NBR_CAGES = 3;

    // 🐾 Attributs
    private Animal[] animals;
    private String city;
    private String name;
    private int animalCount;

    // 🔹 Constructeur
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.animalCount = 0;
    }

    // ✅ Vérifie si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }

    // ✅ Ajoute un animal avec gestion d'exception
    public void addAnimal(Animal animal) throws ZooFullException {
        // Vérifier nullité
        if (animal == null) {
            System.out.println("❌ Animal null : ajout impossible.");
            return;
        }

        // Vérifier si le zoo est plein
        if (isZooFull()) {
            throw new ZooFullException(); // message par défaut : "Le zoo est plein !"
        }

        // Vérifier si l’animal existe déjà
        if (searchAnimal(animal) != -1) {
            System.out.println("⚠️ L’animal " + animal.getName() + " existe déjà !");
            return;
        }

        // Ajouter l’animal
        animals[animalCount++] = animal;
        System.out.println("✅ L’animal " + animal.getName() + " a été ajouté au zoo !");
    }

    // ✅ Recherche d’un animal (retourne son index ou -1)
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].getName().equalsIgnoreCase(animal.getName())) {
                return i;
            }
        }
        return -1;
    }

    // ✅ Supprime un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("⚠️ L’animal " + animal.getName() + " n’existe pas dans le zoo.");
            return false;
        }

        // Décaler les éléments
        for (int j = index; j < animalCount - 1; j++) {
            animals[j] = animals[j + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;

        System.out.println("🗑️ L’animal " + animal.getName() + " a été supprimé !");
        return true;
    }

    // ✅ Affiche le contenu du zoo
    public void displayZoo() {
        System.out.println("🏛️ Zoo : " + name + " (" + city + ")");
        System.out.println("Animaux présents (" + animalCount + "/" + NBR_CAGES + "):");
        for (int i = 0; i < animalCount; i++) {
            System.out.println("   - " + animals[i]);
        }
    }

    // ✅ Compare deux zoos
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) {
            return z1;
        } else if (z2.animalCount > z1.animalCount) {
            return z2;
        } else {
            System.out.println("⚖️ Les deux zoos ont le même nombre d’animaux.");
            return null;
        }
    }

    // ====================== GETTERS / SETTERS ======================

    public String getName() { return name; }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("❌ Le nom du zoo ne doit pas être vide.");
            return;
        }
        this.name = name;
    }

    public String getCity() { return city; }

    public void setCity(String city) {
        if (city == null || city.isEmpty()) {
            System.out.println("❌ La ville ne doit pas être vide.");
            return;
        }
        this.city = city;
    }

    public int getAnimalCount() { return animalCount; }

    public static int getNbrCages() { return NBR_CAGES; }
}
