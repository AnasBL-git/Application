import java.util.Arrays;

public class Zoo {

    static final int MAXCAGES = 25;

    Animal[] animals;
    String name;
    String city;
    int nbrAnimals;

    Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        animals = new Animal[MAXCAGES];
        nbrAnimals = 0;
    }

    Zoo() {
        animals = new Animal[MAXCAGES];
        nbrAnimals = 0;
    }

    boolean addAnimal(Animal animal) {

        if (isZooFull()) {
            System.out.println("Zoo is full!");
            return false;
        }

        if (searchAnimal(animal.name) != -1) {
            System.out.println("Animal already exists!");
            return false;
        }

        animals[nbrAnimals] = animal;
        nbrAnimals++;
        System.out.println(animal.name + " added to the zoo");
        return true;
    }

    int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].name.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    void displayAnimals() {
        System.out.println("Animals in zoo:");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal.name);

        if (index == -1) return false;

        // décalage à gauche
        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[nbrAnimals - 1] = null;
        nbrAnimals--;

        return true;
    }

    boolean isZooFull() {
        return nbrAnimals == MAXCAGES;
    }

    static Zoo compareZoo(Zoo z1, Zoo z2) {
        return (z1.nbrAnimals >= z2.nbrAnimals) ? z1 : z2;
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrAnimals=" + nbrAnimals +
                '}';
    }
}