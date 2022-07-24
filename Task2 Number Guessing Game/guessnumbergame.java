import java.util.Random;
import java.util.Scanner;

class guess1 {
    int inputnumber;
    int randomnumber;
    boolean flag = false;
    int count = 10;
    int currattempt = 1;

    guess1() {
        Random rand = new Random();
        randomnumber = rand.nextInt(100);
    }

    void inputnum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 100: "); // Taking input from user
        inputnumber = sc.nextInt();

    }

    void guessed1() {
        if (inputnumber == randomnumber) // Checking if entered number matches the guess number
        {
            count--;
            flag = true;
            System.out.println("Congrats you won! You guessed it right in " + (10 - count) + " attempts ");
            System.out.println("Your score is " + (100 - count * 10) + " Out of 100 ");
            String sf1 = String.format("You have scored %d points.", 10 - count);
            System.out.println(sf1);
        } else if (inputnumber > randomnumber) { // Checking if entered number is greater than the guess
            count--;
            System.out.println(
                    "Your guessed number is greater than the generated number  You have " + count + " attempts left "); // its helps the user the user enter number is greater than or not
        } else {
            count--;
            System.out.println(
                    "Your guessed number is less than the generated number You have " + count + " attempts left ");
        }
        String sf2 = String.format("This is your %d attempt.", 10 - count); // Displaying the attempt number
        System.out.println(sf2);
    }

}

public class guessnumbergame {
    public static void main(String[] args) {
        guess1 g = new guess1();
        System.out.println("You have 10 attemps to guess a number ");

        while (g.flag != true && g.count > 0) {
            g.inputnum();
            g.guessed1();
        }
        if (g.flag == false) {
            System.out.println("Number generated was " + g.randomnumber
                    + " You failed to guess in given attempts please try again ");

        }
    }
}
