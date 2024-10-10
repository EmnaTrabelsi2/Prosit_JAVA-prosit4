import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;

public class Zoomanagement {

        public static void main(String[] args) {
                // Création d'un animal (Simba)
                Animal lion = new Animal();
                lion.getName("Simba");
                lion.setAge(8);
                lion.setFamily("Cats");
                lion.setMammal(true);

                // Création d'un zoo
                Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
                Zoo notMyZoo = new Zoo("WaterPark", "Siliana");

                // Création d'un autre animal (Snoopy)
                Animal dog = new Animal("Canine", "Snoopy", 2, true);

                // Ajout des animaux au zoo
                System.out.println("Ajout de Simba: " + myZoo.addAnimal(lion));  // True
                System.out.println("Ajout de Snoopy: " + myZoo.addAnimal(dog));  // True
                System.out.println("Tentative d'ajouter Snoopy à nouveau: " + myZoo.addAnimal(dog));  // False (déjà présent)

                // Affichage des animaux du zoo
                myZoo.displayAnimals();

                // Recherche d'animaux dans le zoo
                System.out.println("Recherche de Snoopy: " + myZoo.searchAnimal(dog));  // Affiche l'index
                Animal dog2 = new Animal("Canine", "lll", 2, true);
                System.out.println("Recherche de 'lll': " + myZoo.searchAnimal(dog2));  // Affiche -1 (non trouvé)

                // Suppression d'animaux
                System.out.println("Suppression de Simba: " + myZoo.removeAnimal(lion));  // True
                myZoo.displayAnimals();

                System.out.println("Suppression de 'lll': " + myZoo.removeAnimal(dog2));  // False (non trouvé)
                myZoo.displayAnimals();

                System.out.println("Suppression de Snoopy: " + myZoo.removeAnimal(dog));  // True
                myZoo.displayAnimals();

                // Comparaison de deux zoos (méthode comparerZoo)
                // System.out.println(Zoo.comparerZoo(myZoo, notMyZoo));
                // Vérification si le zoo est plein
                // System.out.println(myZoo.isZooFull());
        }
}
