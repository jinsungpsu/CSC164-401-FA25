public class Cat {
    String name;
    int age;
    String problems;

    Cat() {
        // no-arg constructor
        // purpose of constructor
        // is to create instances/objects
        // and initialize anything related to
        // the object
        name = "unknown";
        age = 5;
    }

    Cat(int knownAge) {
        // overloaded constructor
        age = knownAge;
    }

    Cat(String knownName, int knownAge) {
        age = knownAge;
        name = knownName;
    }

    // boolean result = garfield.sameAge(crookshanks);
    // Cat garfield = new Cat(9);
    // Cat crookshanks = new Cat("Crookshanks", 15);
    boolean sameAge(Cat anotherCat) {
        // age variable = 9 < --- GARFIELD
        // anotherCat.age = 15 <---- CROOKSHANKS
        boolean areTheySameAge;
        if (age == anotherCat.age) {
            areTheySameAge = true;
        } else {
            areTheySameAge = false;
        }
        return areTheySameAge;
    }
}

class Program {
    public static void main(String[] args) {


        System.out.println("Welcome to the PAC");
        System.out.println("1: intake");
        int choice = 1;
        switch(choice) {
            case 1:
                // calling a constructor
                // creating an object
                Cat dixie = new Cat();
                dixie.age = 11;
                dixie.name = "Dixie";
                dixie.problems = "allergies, anxiety";
//                String name = "Dixie";
//                int age = 11;
//                String problems = "skin issues, anxiety";
                break;
            default:
                System.out.println("Blah");
        }
        System.out.println("Thanks for coming in.");

        Cat anotherCat = new Cat();
        anotherCat.age = 10;
        anotherCat.name = "Pixie";
        anotherCat.problems = "demon-possessed";

        Cat garfield = new Cat(9);
        Cat crookshanks = new Cat("Crookshanks", 15);

        boolean result = garfield.sameAge(crookshanks);

        Cat dontknowMuchAboutThiScat = new Cat();
        System.out.println(dontknowMuchAboutThiScat.problems);
    }
}

