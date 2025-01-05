import java.util.Random;

public class ExDice extends Dice{
    int maxValue;

    ExDice(int y){
        this.maxValue = y;
    }
    
    @Override
    int play(){
        Random rand = new Random();
        int x = rand.nextInt(1,maxValue);
        return x;
    }

    int getValue(){
        int value = play();
        return value;
    }
}


