package animals;

public class Bird extends Animal {
    
    public String reproduction = "egg";
    public String outerCovering = "feather";

    @Override
    public void move() {
        System.out.println("Ptica leti.");
    }

    @Override
    public void eat() {
        System.out.println("Ptica kljuca.");
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Reproduction: " + this.reproduction);
        System.out.println("Outer Covering: " + this.outerCovering);
    }
    
}
