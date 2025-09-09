import java.io.File;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /* lab 3 starter code */
        int[] carsSold = {10, 20, 3, 29, 55, 1, 1, 1, 1, 0, 10, 15};

        /*
        arrays in java
         */

        // in c++... we typically did
        // data type variable name []
        // for example, int grades[]
        // this is allowed in java, but discouraged
        // we encourage you to do this instead
        // data type [] variable name
        int[] grades = new int[10]; // explicit size
        int[] grades2 = {1,2,3,4,5}; // implicit size

        /*
        everything about arrays still applies
        0 based counting
        first item is index 0
        last item is length - 1, where length is how many elements can this array store
         */

        System.out.println("This array can store: " + grades.length + " items.");

        for (int i = 0; i < grades.length; i++) {
            System.out.println("In index: " + i + ", the value stored is: " + grades[i]);
        }


        Scanner keyboard = new Scanner(System.in);
        // Scanner input = new Scanner(new File("file.txt"));

        boolean repeatMenu = true;

        if(repeatMenu) {
            System.out.println("Do you want to continue? (Y/N)");
            char continueInput = keyboard.next().charAt(0);
            boolean isInvalidInput = false;
            if (continueInput == 'y' || continueInput == 'Y' || continueInput == 'n' || continueInput == 'N') {
                isInvalidInput = true;
            }
            while(isInvalidInput) {
                System.out.println("Wrong input");
            }
            repeatMenu = (continueInput == 'Y' || continueInput == 'y');
        }

        if (true) {

        }

        char grade = 'a';

        // char grade2 = keyboard.next().charAt(0);

        int errorCode = 99;
        if (grade != 'a') {
            System.out.println("You already passed the class... exiting program");
            System.exit(1);
            return;
        }

        String student1 = "Bob";
        String student2 = "Alex";

        float grade1 = 99.99f;
        float grade2 = 89.29F;

        System.out.printf("\n\n%10s grade is: %5.2f\n", student1, grade1);
        System.out.printf("%10s grade is: %5.2f\n\n", student2, grade2);


        System.out.println("Welcome to the tutoring app:");

    }
}
