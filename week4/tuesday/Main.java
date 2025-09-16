import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] sales = {10,22,33};
        int[] salesCopy = new int[3];

        // in order to copy an array, must manually copy each element
        for (int i = 0; i < sales.length; i++) {
            salesCopy[i] = sales[i];
        }

        salesCopy =  sales; // allowed, but doesn't do what you expect

        int[] months = {1,2,3};

        String[] monthStrings = {"January", "February", "March"};
        for (int i = 0; i < sales.length; i++) {
            System.out.println("For month " + months[i] + ", cars sold is: " + sales[i]);
            System.out.println("For month " + (i+1) + ", cars sold is: " + sales[i]);
        }

        // for each loop
        // data type of array you're iterating through
        // some identifier you decide, usually "each"
        // followed by a :
        // followed by the array
        for (int each: sales) {
            //System.out.println("Sales for month were: " + sales[i]);
            System.out.println("Sales for month were: " + each);
        }

        for (int carsSoldThisMonth: sales) {
            System.out.println("Sales for month were: " + carsSoldThisMonth);
        }

        int[] oneD = {1,2,3};
        int[][] twoD = {      // first dimension is size 4
                {1,2,3},        // second dimension is size 3
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };
        // how to print "8"
        System.out.println(twoD[2][1]);

        /*
        how would i print all values
        [0][0], [0][1], [0][2],
        [1][0], [1][1], [1][2],
        [2][0], [2][1], [2][2],
        [3][0], [3][1], [3][2],
         */

        for (int i = 0; i < twoD.length; i++) {
            // twoD.length = 4 (first dimension)

            // anything in here...
            // repeats 4 times

            System.out.println();  // new line

            for (int j = 0; j < twoD[i].length; j++) {
                // twoD[i].length = 3

                // anything in here... repeats...
                // 3 times...
                // but nested, so 4 x 3 times = 12

                System.out.printf("%4s", twoD[i][j]);
            }
        }

        for (int row = 0; row < twoD.length; row++) {
            for (int col = 0; col < twoD[row].length; col++) {

            }
        }

        for (int[] row: twoD) {
            for (int each: row) {

            }
        }



    }
}
