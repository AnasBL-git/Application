package Entites;

public class Zoo {

    private static final int MAX_CAGES = 25;

    private Animal[] animals;
    private String name;
    private String city;
    private int nbrAnimals;

    public Zoo(String name, String city) {
        setName(name);
        this.city = city;
        animals = new Animal[MAX_CAGES];
        nbrAnimals = 0;
    }

    public Zoo() {
        animals = new Animal[MAX_CAGES];
        nbrAnimals = 0;
    }


    public String getName() {
        return name;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Zoo name can't be empty");
        }
    }


    public boolean addAnimal(Animal animal) {
        if (isZooFull()) return false;

        if (searchAnimal(animal.getName()) != -1) return false;

        animals[nbrAnimals++] = animal;
        return true;
    }

    public int searchAnimal(String name) {
        for (int i = 0; i < nbrAnimals; i++) {
            if (animals[i].getName().equalsIgnoreCase(name))
                return i;
        }
        return -1;
    }

    public boolean removeAnimal(String name) {
        int index = searchAnimal(name);
        if (index == -1) return false;

        for (int i = index; i < nbrAnimals - 1; i++) {
            animals[i] = animals[i + 1];
        }

        animals[--nbrAnimals] = null;
        return true;
    }

    public boolean isZooFull() {
        return nbrAnimals == MAX_CAGES;
    }

    public static Zoo compareZoo(Zoo z1, Zoo z2) {
        return (z1.nbrAnimals >= z2.nbrAnimals) ? z1 : z2;
    }

    public void displayAnimals() {
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }
}