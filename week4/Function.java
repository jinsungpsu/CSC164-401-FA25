import java.util.Scanner;

public class Function {
    // keep main up on the top
    // so you don't have to go look for it..
    public static void main(String[] args) {
        System.out.println("Welcome");
        Scanner keys = new Scanner(System.in);
        while(true) { // don't overuse this
            printMenu();
            int choice = keys.nextInt();
            if (choice == 4) {
                System.exit(1); // don't overuse this
            }
            switch (choice) {
                case 5:
                    // nelson agholor
                    // dropped pass
                    // the sum method gives main an int
                    // but i did nothing with it
                    // normally, this would be kind of weird
                    sum(1,2);

                    // what do i normally do with an integer???
                    // ANYWHERE i normally use an integer
                    // i can use the sum method call

                    int num = sum(1,1);
                    int sum = 1 + sum(1,1);

                    for (int i = sum(1,3); i < 10; i++) {

                    }

                    System.out.println(sum(1,10));

                    int sumsum = sum(sum(1,1), sum(1,2));


            }
        }
    }

    // can be wherever, no prototype needed
    static void printMenu() {
        System.out.println("1. play the game");
        System.out.println("2. save");
        System.out.println("3. load");
        System.out.println("4. quit");
        System.out.println("5. add up 2 numbers");
    }

    static int sum(int num1, int num2) {
        return num1+num2;
    }




}

