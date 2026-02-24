package main;

import Entites.Animal;
import Entites.Zoo;
import Entites.Aquatic;
import Entites.Terrestrial;
import Entites.Dolphin;
import Entites.Penguin;

public class Main {


    public static void main(String[] args) {

        Zoo zoo1 = new Zoo("Belvedere", "Tunis");
        Zoo zoo2 = new Zoo("Friguia", "Hammamet");

        Animal a1 = new Animal("Lion", "Simba", 5, true);
        Animal a2 = new Animal("Tiger", "Sheru", 4, true);
        Animal a3 = new Animal("Elephant", "Dumbo", 10, true);
        Animal a4 = new Animal("Lion", "Simba", 5, true);
        Aquatic aq1= new Aquatic("3awem",2,"cephalopod","coral reefs");
        Terrestrial ter1= new Terrestrial("Machey",3,"primate",4);
        Penguin p1= new Penguin("Penguins",3,"Batri9",100);
        Dolphin d1= new Dolphin("Dolphins",4,"delphin",60);

        System.out.println(aq1.toString());
        System.out.println(ter1.toString());
        System.out.println(p1.toString());
        System.out.println(d1.toString());
        d1.Swim();
        p1.Swim();

        zoo1.addAnimal(a1);
        zoo1.addAnimal(a2);
        zoo1.addAnimal(a3);

        boolean added = zoo1.addAnimal(a4);
        if(added) {
            System.out.println("Zoo has been added");
        }
        else {
            System.out.println("Zoo hasn't been added");
        }

        System.out.println("\nZoo1 Animals:");
        zoo1.displayAnimals();


        int index = zoo1.searchAnimal("Simba");
        System.out.println("\nIndex of Simba: " + index);

        int index2 = zoo1.searchAnimal("Unknown");
        System.out.println("Index of Unknown : " + index2);


        boolean removed = zoo1.removeAnimal("Simba");
        if(removed) {
            System.out.println("Zoo has been removed");
        }
        else {
            System.out.println("Zoo hasn't been removed");
        }

        System.out.println("\nAnimals after removal:");
        zoo1.displayAnimals();

        if (zoo1.isZooFull())
            System.out.println("Zoo full");
        else
            System.out.println("Zoo not full");

        zoo2.addAnimal(new Animal("Monkey", "Koko", 2, true));
        zoo2.addAnimal(new Animal("Giraffe", "Longneck", 7, true));

        Zoo biggerZoo = Zoo.compareZoo(zoo1, zoo2);
        System.out.println("\nZoo with more animals:" + biggerZoo.getName());
    }


}
