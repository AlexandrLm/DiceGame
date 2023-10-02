import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        final int MIN = 1;
        final int MAX = 6;

        Random rand = new Random();
        int dice1 = rand.nextInt(MAX - MIN + 1) + MIN;
        int dice2 = rand.nextInt(MAX - MIN + 1) + MIN;

        System.out.print("Dice 1: " + dice1 + "\nDice 2: " + dice2);

        if(dice1 == dice2) {
            System.out.print("\nВы выиграли!\n");
        } else {
            System.out.print("\nВам повезет в следующий раз!\n");
        }
    }
}