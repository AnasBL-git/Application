public class Main {
    public static void main(String[] args) {

        Zoo zoo = new Zoo("Belvedere", "Tunis");
        Animal a1 = new Animal("Lion", "Simba", 5, true);
        Animal a2 = new Animal("Tiger", "Nemr", 4, true);
        Animal a3 = new Animal("Lion", "Simba", 5, true);

        zoo.addAnimal(a1);
        zoo.addAnimal(a2);
        zoo.addAnimal(a3);
        zoo.displayAnimals();

        System.out.println("Index of Simba: " + zoo.searchAnimal("Simba"));

        zoo.removeAnimal(a1);
        zoo.displayAnimals();

        Zoo zoo2 = new Zoo("MiniZoo", "Sousse");
        zoo2.addAnimal(new Animal("Monkey", "Guerd", 2, true));

        Zoo bigger = Zoo.compareZoo(zoo, zoo2);
        System.out.println("Zoo with more animals:" + bigger.name);
    }
}