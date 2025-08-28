/*
multi line comment
in this class, you have to put in some stuff here

Jin An
CSC164
8/26

I did not cheat.
 */

/*
 * ask the user which pokemon to pick for battle
 * go round by round to figure out who's the strongest
 * each round, pick an attack
 * calculate
 */

public class Main {
    public static void main(String[] args) {

        /*
        class names start with upper case
        var names start with lower case
        function names also
         */
        int myClass;

        int my_class;

        // in cpp constants
        // const int TAX_RATE = 6;

        final double TAX_RATE = 0.06;
        // don't do TAXrATE <- not a thing

        // like int main in cpp
        System.out.printf("Hello and welcome!");
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }
    }
}

class Bob {
    public static void main(String[] args) {
        int grade = 98;
        System.out.println("Hello World");
        // cout << "Hello World";


        char gradeLetter;

        if (grade >= 90) {
            // cout
            gradeLetter = 'a';
        } else if (grade >= 80) {
            gradeLetter = 'b';
        } else {
            gradeLetter = 'f';
        }

        System.out.print("Your grade is: " + gradeLetter);
        // cout << "Your grade is: " << gradeLetter;

        // num++;
    }
}
