package Entites;

public class Penguin extends Aquatic{
    float swimmingDepth;
    public Penguin(){}
    public Penguin(String family, int age,String name,float swimmingDepth) {
        this.setFamily(family);
        this.setAge(age);
        this.setName(name);
        this.setSwimmingDepth(swimmingDepth);
    }
    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }
    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    @Override
    public String toString() {
        return super.toString()+"penguin swimming depth:"+getSwimmingDepth();
    }
    public void Swim () {
        System.out.println("This penguin is swimming");
    }
}
