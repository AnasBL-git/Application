package Entites;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;
    public Dolphin(){}
    public Dolphin(String family, int age,String name,float swimmingSpeed) {
        this.setFamily(family);
        this.setAge(age);
        this.setName(name);
        this.setSwimmingSpeed(swimmingSpeed);
    }
    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }
    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    @Override
    public String toString() {
        return super.toString()+"dolphin swimming speed:"+getSwimmingSpeed();
    }

    public void Swim () {
        System.out.println("This dolphin is swimming");
    }
}
