import java.util.Random;

public class Dice {
    public static void main(String[] args){
        Dice dice = new Dice();
        System.out.println(dice.getValue());
    }

    public int play(){
        Random rand = new Random();
        int x = rand.nextInt(1,6);
        return x;
    }

    public int getValue(){
        int value = play();
        return value;
    }
}
