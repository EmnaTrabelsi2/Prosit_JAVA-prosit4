package tn.esprit.gestionzoo.entities;

public class Zoo {
    private static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;

    // Constructeur par défaut
    public Zoo() {}

    // Constructeur avec validation du nom du zoo
    public Zoo(String name, String city) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Le nom du zoo ne peut pas être vide.");
        }
        this.name = name;
        this.city = city;
        this.animals = new Animal[NUMBER_OF_CAGES];
    }

    // Méthode de comparaison de deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        return z1.nbrAnimals > z2.nbrAnimals ? z1 : z2;
    }

    // Affichage des détails du zoo
    public void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    // Méthode pour ajouter un animal avec vérification si le zoo est plein
    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1 || isZooFull()) {
            return false;
        }
        animals[nbrAnimals] = animal;
        nbrAnimals++;
        return true;
    }

    // Méthode pour enlever un animal
    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1) {
            return false;
        }
        for (int i = indexAnimal; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }
        this.nbrAnimals--;
        animals[nbrAnimals] = null;
        return true;
    }

    // Affichage des animaux dans le zoo
    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    // Recherche d'un animal dans le zoo
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName("Simba").equals(animals[i].getName("Simba"))) {
                return i;
            }
        }
        return -1;
    }

    // Vérification si le zoo est plein
    private boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }
}
