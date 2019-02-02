
package animals;


public class Insect extends Animal {
    
    private int numberOfLegs = 6;

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    

    @Override
    public void move() {
    }

    @Override
    public void eat() {
    }
    
}
