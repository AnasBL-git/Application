import java.util.Arrays;

public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    Zoo(Animal[] animals, String name, String city, int nbrCages) {
        this.animals = animals;
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }
    Zoo(){}
    public void displayZoo() {
        for (int i = 0; i < this.animals.length; i++) {
            System.out.println(this.animals[i]);
        }
        System.out.println(this.name);
        System.out.println(this.city);
        System.out.println(this.nbrCages);
    }

    @Override
    public String toString() {
        return "Zoo{" +
                "animals=" + Arrays.toString(animals) +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                ", nbrCages=" + nbrCages +
                '}';
    }
}

