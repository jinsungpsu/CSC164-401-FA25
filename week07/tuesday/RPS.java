import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

/*
What are the objects?
How do they interact with each other?

game
* player or cpu
** name
** score
** hand
***  rock, paper, scissors

*** something for later
* cpu (maybe a little different than a player...)
** difficulty

human vs cpu
human picks rps
random generated cpu choice
pick winner
ask user if they wanna play again
 */
public class Main {
    public static void main(String[] args) {

        Game game = new Game();
        game.start();
    }
}

/*
in general, classes should be in their own files
 */
class Player {
    private String name;
    private int score;
    private Hand gesture = new Hand();

    Player(String name) {
        // "this" object's name = name passed in through the parameter
        this.name = name;
    }

    public void win() {
        System.out.println(name + " wins!");
        score++;
    }

    public void lose(){
        // do i need something?
    }

    public void setGesture(String gesture) {
        this.gesture.setChoice(gesture);
    }

    public void setRandomGesture() {
        this.gesture.setRandomGesture();
    }

    public String getHand() {
        return gesture.getChoice();
    }


}

class Hand {
    private String choice;
    public static String[] CHOICES = {"rock", "paper", "scissors"};

    public void setChoice(String choice) {
        /*
        normally would want to maybe do some validation
        so it's rock, paper, scissors
         */
        this.choice = choice;
    }

    public String getChoice() {
        return choice;
    }

    public void setRandomGesture() {
        Random rng = new Random();
        int randomNum = rng.nextInt(3);
        choice = CHOICES[randomNum];
    }
}

class Game {
    private Player p1;
    private Player p2;
    private final String WELCOME_MESSAGE = "Welcome to this thrilling game of Roshambo";
    private static Scanner keyboard = new Scanner(System.in);

    private void printWelcome() {
        System.out.println(WELCOME_MESSAGE);
    }

    public void start() {
        boolean again = true;
        while(again) {
            printWelcome();
            p1 = new Player("Alex");
            p2 = new Player("CPU");

            p1.setGesture(getUserChoice());
            p2.setRandomGesture();

            showChoices();
            determineWinner();

            again = playAgain();
        }
    }

    private void showChoices() {
        System.out.println("P1: " + p1.getHand());
        System.out.println("P2: " + p2.getHand());
    }

    private void determineWinner() {
        if (p1.getHand().equals("rock") && p2.getHand().equals("scissors")) {
            // winner is p1
            p1.win();
        }
    }

    private String getUserChoice() {
        System.out.println("R, P or S?");
        String choice = keyboard.next();
        // should do some input validation...
        return choice;
    }

    private boolean playAgain() {
        System.out.println("Do you want to play again? (Y/N)");
        // char again = keyboard.next().charAt(0);
        String choice = keyboard.next();
        char again = choice.charAt(0);
        if (again=='Y') return true;
        return false;
    }


}
