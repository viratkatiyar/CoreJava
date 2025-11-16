package Basics;

import java.util.Scanner;

public class GuessingGame {
    int guessNum(){
        return (int) (Math.ceil(Math.random() * 6));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        GuessingGame comNum = new GuessingGame();
        int decideNum = 0;
        System.out.println("Game Started You will get 3 chances only to Lose and Win");
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter Number from (1 to 6) : ");
            int num = scan.nextInt();
            int comp = comNum.guessNum();
            if (num == comp) {
                decideNum ++;
                break;
            }
            else{
                System.out.println("Wrong Guess");
                System.out.println("Computer guessed: " + comp);
            }
        }
        if(decideNum == 1){
            System.out.println("You Won the Game");
        }
        else{
            System.out.println("Game Over, Play Again");
        }
    }
}
