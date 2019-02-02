
package animals;

public class Fish extends Animal {
    
    private String waterType = "Sea";

    @Override
    public void move() {
        System.out.println("Riba pliva.");
    }

    @Override
    public void eat() {
        System.out.println("Riba jede morsku hranu.");
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Lives in: " + this.waterType);
    }
}
