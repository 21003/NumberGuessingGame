import java.util.Scanner;

public class NumberGame {

    public static void main(String[] args) {
        Scanner keyboard;
        keyboard = new Scanner(System.in);

        int randomNumber, userNumber;

        randomNumber = (int) (Math.random() * 100);
        System.out.println(randomNumber);

        System.out.println("Can you give me a number between 1 and 100 please");
        userNumber = keyboard.nextInt();

        if (userNumber == randomNumber) {
            System.out.println(randomNumber+ " is the correct number");
        }
        while (userNumber < randomNumber || userNumber > randomNumber) {

            if (userNumber < randomNumber) {

                System.out.println("I'm sorry that number is to low");
                userNumber = keyboard.nextInt();
            }

            if (userNumber > randomNumber) {

                System.out.println("I'm sorry that number is to high");
                userNumber = keyboard.nextInt();

                }
                if (userNumber == randomNumber){

                System.out.println(randomNumber+ " is the correct number");

                }
        }
    }
}


