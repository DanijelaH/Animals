
import animals.Bird;
import animals.Eagle;
import animals.Fish;

public class Main {

    
    public static void main(String[] args) {
        
        Bird myBird = new Bird();
        
        myBird.info();
        myBird.move();
        myBird.eat();
        
        System.out.println("");
        
        Eagle eagle = new Eagle();
        eagle.info();
        eagle.move();
        eagle.eat();
        
        System.out.println("");
        
        
        Fish myFish = new Fish();
        myFish.info();
        myFish.move();
        myFish.eat();
        
    }
    
}
