package tn.esprit.gestionzoo.entities;

public class Zoo {

    public static final int NBR_CAGES = 25;

    private final Animal[] animals = new Animal[NBR_CAGES];
    private int animalCount = 0;

    private Aquatique[] aquaticAnimals = new Aquatique[10];
    private int aquaticCount = 0;

    protected String city;
    protected String name;

    // ——— Constructeur ———
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
    }

    // ——— Helpers capacité ———
    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }


    // ——— CRUD animaux « classiques » ———
    public boolean addAnimal(Animal animal) {
        if (animal == null) {
            System.out.println("Animal null : ajout impossible.");
            return false;
        }
        if (isZooFull()) {
            System.out.println("Le zoo est plein.");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("L’animal " + animal.name + " existe déjà !");
            return false;
        }

        animals[animalCount++] = animal;
        System.out.println("L’animal " + animal.name + " a été ajouté au zoo !");
        return true;
    }

    public int searchAnimal(Animal animal) {
        if (animal == null || animal.name == null) return -1;
        for (int i = 0; i < animalCount; i++) {
            String n = animals[i].name;
            if (n != null && n.equalsIgnoreCase(animal.name)) {
                return i;
            }
        }
        return -1; // pas trouvé
    }

    public boolean removeAnimal(Animal animal) {
        int idx = searchAnimal(animal);
        if (idx == -1) return false;

        // Décale vers la gauche
        for (int j = idx; j < animalCount - 1; j++) {
            animals[j] = animals[j + 1];
        }
        animals[--animalCount] = null;

        System.out.println("L’animal " + animal.name + " a été supprimé !");
        return true;
    }

    public void displayZoo() {
        System.out.println("Zoo: " + name + " à " + city);
        System.out.println("Animaux présents (" + animalCount + "/" + NBR_CAGES + "):");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(" - " + animals[i]);
        }
    }


    // ——— Utilitaires ———
    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) return z1;
        if (z2.animalCount > z1.animalCount) return z2;
        System.out.println("Les deux zoos ont le même nombre d’animaux.");
        return null; // égalité
    }

    // ——— Getters/Setters minimaux ———
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            System.out.println("Le nom ne doit pas être vide.");
            return;
        }
        this.name = name;
    }
    //ajouter un animal aquatique


    public void addAquaticAnimal(Aquatique aquatique) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount] = aquatique;
            aquaticCount++;
            System.out.println("L’animal aquatique " + aquatique.name + " a été ajouté !");
        } else {
            System.out.println("Le bassin est plein, impossible d’ajouter " + aquatique.name);
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public static int getNbrCages() {
        return NBR_CAGES;
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;

        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.getSwimmingDepth() > maxDepth) {
                    maxDepth = p.getSwimmingDepth();
                }
            }
        }

        return maxDepth;
    }
    // ——— Comptage des aquatiques par type ———
    public void displayNumberOfAquaticsByType() {
        int dolphins = 0;
        int penguins = 0;

        for (int i = 0; i < aquaticCount; i++) {
            Aquatique a = aquaticAnimals[i];
            if (a == null) continue;

            if (a instanceof Dolphin) {
                dolphins++;
            } else if (a instanceof Penguin) {
                penguins++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphins);
        System.out.println("Nombre de pingouins : " + penguins);
    }

}


