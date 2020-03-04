/**
 * this is a simple math game for grades 3-5
 *
 * @author Shane Delamont and Guy Pukallus
 */
import java.awt.*;
import java.util.Random;
import java.util.Scanner;
public class MathGame {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = keyboard.nextLine();
        System.out.println("Hi " + name + "! We are going to play a fun math game:\n" +
                "What is? ");

        int correct = 0;

        for (int i = 0; i < 10; i++) {
            Random rnd = new Random ();
            int randomNumber1 = rnd.nextInt(12) + 1;
            int randomNumber2 = rnd.nextInt(12) + 1;
            int randomNumberAdd = randomNumber1 + randomNumber2;


            System.out.print(randomNumber1 + " + " + randomNumber2 + " = ");
            int RandomNumberAdd = keyboard.nextInt();

            if (RandomNumberAdd == randomNumber1 + randomNumber2) {

                System.out.println("Correct!");
                correct++;
            } else {
                System.out.println("Wrong!");
                System.out.println("The correct answer is " + randomNumberAdd);
            }
        }
                System.out.println("You scored  " + correct + " out of 10");
                if (correct >= 8) {

                System.out.println("Well done");
                } else if (correct < 8 && correct >= 6) {
                    System.out.println("Nice try");
                } else {
                    System.out.println("Try again");
                }
            }
        }


