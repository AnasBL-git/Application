package Entites;

public class Terrestrial extends Animal{
    int nbrLegs;
    public Terrestrial(){}
    public Terrestrial(String name,int age, String family, int nbrLegs){
        this.setName(name);
        this.setAge(age);
        this.setFamily(family);
        this.setNbrLegs(nbrLegs);
    }
    public void setNbrLegs(int nbrLegs){
        this.nbrLegs = nbrLegs;
    }
    public int getNbrLegs() {
        return nbrLegs;
    }

    @Override
    public String toString() {
        return super.toString()+"Terrestrial's number of legs: "+getNbrLegs();
    }
}
