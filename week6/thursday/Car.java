public class Car {
    int miles;
    double speed;

    private String vinNumber;

    Car(int milage) {
        miles = milage;
        speed = 0;
    }

    void drive() {
        miles++;
        speed++;
    }

    void park() {
        speed = 0;
    }

    void destroyEvidence() {
        speed = 150;
    }

    void drive(boolean copChase) {
        if (copChase) {
            speed++;
            miles++;
        } else {
            miles++;
        }
    }
}

class Blah {
    public static void main(String[] args) {
        // 3 steps
        // 1 define a ref var
        // 2 create a car object
        // 3 = means assign that object to
        // the ref var
        Car car = new Car(2);

        Car car1 = new Car(20);
        Car car2 = car1;

        Car car3 = null;
        car3.miles = 10;
        car3.speed = 500;

        car3.drive(); // use dot notation to access
        // stuff related to this car
        // stuff = methods/variables
       /*
        drive method doesn't need any "outside"
        data, because it already has access
        to speed/miles
         */

        // car3.vinNunber = "1F3Q2341234B3f";
        // vinNumber is private, so cannot be directly
        // changed using dot notation



        /*
        overloaded drive method DOES need outside
        data (arguments)
         */

        car3.drive(true);
        /*
        this is NOT the same as
        int num1 = 5;
        int num2 = num1;

        num1 and num2 each hold their own
        different versions of the number 5
         */



        Car dumbCar;
        new Car(5);
        /*
        similar to:
        int num1;
        5;
         */
    }
}
