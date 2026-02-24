package Entites;

public class Aquatic extends Animal{
    String habitat;
    Aquatic(){}
    public Aquatic(String name,int age, String family, String habitat){
        this.setName(name);
        this.setAge(age);
        this.setFamily(family);
        this.setHabitat(habitat);
    }
    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getHabitat(){
        return this.habitat;
    }

    @Override
    public String toString() {
        return super.toString()+"aquatic animal habitat: "+getHabitat();
    }
    public void Swim(){
        System.out.println("Swimming");
    }
}
