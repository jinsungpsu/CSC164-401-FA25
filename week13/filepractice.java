  private void filepractice() {
        String filename = "D:\\Users\\jan.DTCC\\Desktop\\CSC164-FA25\\Week13\\csc164-week13\\src\\main\\resources\\myfile2.txt";
        try {
            Scanner fileInput = new Scanner(new File("myfile1.txt"));
            System.out.println(fileInput.nextLine());
            Scanner absolutePathFile = new Scanner(new File(filename));
            System.out.println(absolutePathFile.nextLine());
        } catch (FileNotFoundException error) {
            System.out.println("The error is: " + error);
            System.out.println("Oh... file not found?");
            System.out.println("How should we proceed?");
            System.out.println("Create a new file??");
        }

        int[] arr = {1,2,3};
        try {
            System.out.println(arr[4]);
        } catch (IndexOutOfBoundsException error) {
            System.out.println("You can't do that buddy");
        }

        int input;

        Scanner keyboard = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Enter a number: ");
                input = keyboard.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("You didn't enter an integer");
                keyboard.next();
                continue;
            }
        }
    }
