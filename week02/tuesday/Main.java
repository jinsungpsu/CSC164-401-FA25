import java.util.Scanner;
// similar to #include <iostream>

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // calculate ingredients for cookies
        // figure out how much ingredients for
        // unknown # of cookies

        // don't know how to do input/output, so we'll do that later

        /*
        * top down approach
        * figure out how many cookies to make
        * calculate ingredients needed
        ** per cookie, you need
        ** 1/8 cup of flour
        *** # of cups of flour needed for whole batch = # of cookies * 1/8 cup of flour
        ** 1/16 cup of sugar
         *** # of cups of sugar needed for whole batch = # of cookies * 1/16 cup of sugar
        ** 1/16 cup of butter
         *** # of cups of butter needed for whole batch = # of cookies * 1/16 cup of butter
        * output stuff
         */

        // input in java is a bit more annoying...
        // define a variable for the input

        // data type is Scanner
        // identifier can be anything...
        // but... use same logic as ANY var name
        // should be descriptive
        Scanner keyboard;
        // like any variable, you need to assign it something

        keyboard = new Scanner(System.in);
        // don't worry about it
        // standard input stream from System

        int numCookies = 10;

        // instead of "hard-coding" the value 10
        // i want to assign this variable data
        // from the keyboard
        numCookies = keyboard.nextInt();
        // nextInt() would change to something else
        // depending on the data type

        // just like C++... probably use a prompt so user know what's going on


        final double CUPS_SUGAR_PER_COOKIE = 1D/8; // 0.125 cups of sugar
        // integer division... LOGIC error
        // we can cast <--- explicitly change something to a different
        // or we can make sure the computer understands that the values
        // we are using are NOT integers
        // when using numerical literals in java
        // we can use a suffix
        // we can specify type, by using D for double or F for float

        final double CUPS_FLOUR_PER_COOKIE = 1D/16;
        final double CUPS_BUTTER_PER_COOKIE = 1D/16;

        // need fractions/floating point
//        double cupsSugarNeeded = numCookies * CUPS_SUGAR_PER_COOKIE;
//        double cupsFlourNeeded = numCookies * CUPS_FLOUR_PER_COOKIE;
//        double cupsButterNeeded = numCookies * CUPS_BUTTER_PER_COOKIE;
        double cupsSugarNeeded = calculateCupsNeededForBatch(CUPS_SUGAR_PER_COOKIE, numCookies);
        double cupsFlourNeeded = calculateCupsNeededForBatch(CUPS_FLOUR_PER_COOKIE, numCookies);
        double cupsButterNeeded = calculateCupsNeededForBatch(CUPS_BUTTER_PER_COOKIE, numCookies);
        // when it's stored... instead of 1.2334, you'll have 1.233334898891
        // most programmers just use double, bc we're not very concerned about

        // you can use keyboard shortcut sout
        // prints whatever is inside the parenthesis
        // followed by a new line character \n
        System.out.println("Hello World");
        // is same as
        System.out.print("Hello World\n");

        // you can use sout with any data types
        // System.out.println(numCookies);

        // String starts with upper case S... means it's a class
        // don't worry about what that means just yet
        String welcomeMessage = "Hi there, here's a cookie calculator";
        System.out.println(welcomeMessage);


        // very different than c++
        // we can do output via "addition"
        // addition can only be done using same data types
        // so... pay attention to order of operations/precedence

        System.out.println("Ingredients needed to make " + numCookies + " cookies");



    }

    // let's write a function for modularity
    // instead of calculating each ingredient... what's the "general"
    // problem?

    // functions will have this static word in front
    // don't worry about it for now.. =X
    static double calculateCupsNeededForBatch(double perUnit, int numUnits) {
        return perUnit * numUnits;
    }
}
