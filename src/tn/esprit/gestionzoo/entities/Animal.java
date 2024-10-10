package tn.esprit.gestionzoo.entities;

public class Animal {
    private String family, name;
    private int age;
    private boolean isMammal;

    // Constructeur par défaut
    public Animal() {}

    // Constructeur avec validation de l'âge
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        setAge(age); // Validation de l'âge
        this.isMammal = isMammal;
    }

    // Getter et Setter avec validation pour l'âge
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("L'âge ne peut pas être négatif.");
        }
        this.age = age;
    }

    public String getName(String simba) {
        return name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                '}';
    }

    public void setFamily(String cats) {
    }
}
