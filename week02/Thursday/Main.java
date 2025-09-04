//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}

class AnotherExample {
    public static void main(String[] args) {
        for (int i = 0; i < 26*5; i++) {
            if(i % 26 == 0) {
                System.out.println();
            }
            System.out.print("#");
        }
        System.out.println();
        System.out.println("##########################");
        System.out.println("Welcome to the pizza shop!");
        System.out.println("##########################");
        int pizzas = 10;

        // implicit casting
        // automatic
        double pizzaAmount = pizzas;

        int people = 5;

        if (people < 2) {
            pizzas /= 2;
        }

        if (people > 10) {
            System.out.println("That's a lot of people");
            System.out.println("Make sure you have at least 10 pizzas.");
            if (pizzas < 5) {
                System.out.println("Not enough pizzas!  Order molre!");
                // pizzas = pizzas + 5;
                // same as pizzas += 5;

                pizzas *= 2;
            }
            if (people < 0) {
                System.out.println("Error of some sort..");
                System.out.println("Negative number");

                System.out.write('\n');
                // same as a println
            }
            if (pizzas % 2 == 0) {
                System.out.println("Even # of pizzas - OCD achieved!");
            }
        }
        double pizzaOrderPrice = pizzas * 16.99;

        // explicit casting
        // NOT automatic
        // syntax error if you don't take care of it
        int dollars = (int)pizzaOrderPrice;
        System.out.printf("Here's your receipt:\n%s $%.2f", "The price is: ", pizzaOrderPrice);
    }
}

class DallasSucks {
    public static void main(String[] args) {

    }
}
