public class Main2 {
    public static void main(String[] args){
        Dice dice = new Dice();
        System.out.println(dice.getValue());
        ExDice exdice = new ExDice(100);
        System.out.println(exdice.getValue());
    }
}
