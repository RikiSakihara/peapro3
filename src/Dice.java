import java.util.Random;

public class Dice {

    Dice(){
    } 
    
    int play(){
            Random rand = new Random();
            int x = rand.nextInt(1,7);
            return x;
        }

    int getValue(){
        int value = play();
        return value;
    }
}
