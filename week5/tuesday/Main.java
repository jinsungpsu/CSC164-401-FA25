//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {0,1,2};
        int[] arr2 = {3,4,5};
        int[] arr3 = {6,7,8};
        int[] arr4 = {10,20,30};
        int[] arr5 = {40,50,60};
        int[] arr6 = {70,80,90};

        int[][] twoD = {
                arr1, arr6
        };

        printArr(twoD);

        int[][][] threeD = {
                twoD,
                {arr1,arr2}
        };

        printArr(threeD);
    }

    static void printstuff(String message) {
        System.out.println(message);
    }

    static void printArr(int[][][] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("     {");
                for (int k = 0; k < arr[i][j].length-1; k++) {
                    System.out.printf("%5d,", arr[i][j][k]);
                }
                System.out.printf("%5d }", arr[i][j][arr[i][j].length-1]);
            }
        }
    }

    static void printArr(int[][] arr) {
        printstuff("These are the contents of my 2D array!!");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("%5d", arr[i][j]);
            }
        }
    }
}
