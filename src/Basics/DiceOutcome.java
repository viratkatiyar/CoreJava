package Basics;

public class DiceOutcome {
    int roll(){
        return (int)(Math.ceil((Math.random() * 6)));
    }
    public static void main(String[] args) {
        DiceOutcome dice = new DiceOutcome();
        for (int i = 0; i < 5; i++) {
            System.out.println("Dice Outcome : " + dice.roll());
        }
    }
}
