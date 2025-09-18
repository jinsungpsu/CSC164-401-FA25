import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

/*
int blah (int& someNumber) {
    pass by reference in C++
    if the number is changed here, it's also changed OUTSIDE of the class
}
 */

public class Main {
    static Scanner keyboard= new Scanner(System.in);

    public static void main(String[] args) {
        String chosenOption = "";
        while(!chosenOption.equals("Exit")) {
            // rock, paper, scissors
            chosenOption = menu();
            /*
            input: Scanner?
            output: what does the user want?
            examples: play or exit or play another
             */
            String p1 = playerChoice();
            playerChoice();
            String computer = computerChoice();
            printWinner(p1, computer);
        }
    }

    static void printWinner(String p1) {
        // overloaded method... this one only takes one string
        // instead of two
    }

    private static void printWinner(String p1, String computer) {
        boolean playerWins = false;
        if (p1.equals("Scissors") && computer.equals("Paper")) {
            playerWins = true;
        } else if (p1.equals("Paper") && computer.equals("Scissors")) {
            playerWins = false;
        }
        if (playerWins) {
            System.out.println("Player wins");
        } else {
            System.out.println("Computer wins");
        }
    }

    static String computerChoice() {
        Random rnd = new Random();
        switch(rnd.nextInt(3)) {
            case 0:
                return "Paper";
            case 1:
                return "Scissors";
            case 2:
                return "Rocks";
            default:
                return "Rocks";
        }
    }

//    static void playerChoice() {
//        this is not an overloaded method
//         differing return type CANNOT be differentiated
//    }

    static String playerChoice() {
        System.out.println("\n\nR, P, or S?");
        String choice = keyboard.next();
        switch(choice) {
            case "R":
            case "r":
                return "Rocks";
            case "s":
            case "S":
                return "Scissors";
            case "P":
            case "p":
                return "Paper";
            default:
                return "P";
        }
    }

    static String menu() {
        return "Play";
    }

}
