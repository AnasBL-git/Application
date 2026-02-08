import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Animal ape= new Animal("ape","guerd",3,true);
        Zoo myZoo=new Zoo(
                new Animal[]{
                        new Animal("lions","sid",4,true)
                },"hadiket hayawenet","tunis",50);
        ZooManagement zoo = new ZooManagement();
        Scanner scanner = new Scanner(System.in);
        myZoo.displayZoo();
        System.out.println(myZoo);
        ape.displayAnimal();


        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages.");
        do{
            System.out.print("Entrez le nom du zoo : ");
            zoo.zooName = scanner.nextLine();
        }while(zoo.zooName.trim().isEmpty());
        do {
            System.out.println("Entrez le nombre de cages du zoo");
            while (!scanner.hasNextInt()) {
                System.out.print("Veuillez entrer un nombre valide : ");
                scanner.next();
            }
            zoo.nbrCages = scanner.nextInt();
        } while (zoo.nbrCages<=0);
        System.out.println(zoo.zooName + " comporte " + zoo.nbrCages + " cages.");
        scanner.close();
    }
}
