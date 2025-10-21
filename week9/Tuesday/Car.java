class Vehicle extends Object {
    // should have all the commonalities
    // that are shared in each subclass
    private double speed;
    private String model, manufacturer;

    /*
    Constructor chaining can create some issues
    If I create a vehicle...
    at minimum, I need to say how fast it's going

    so... this means that I also cannot create
    any other subclass object without specifying speed

    two ways of fixing this...
    1) add a no-arg constructor
        but do i really want to?  depends
    2) each subclass can figure out what to do...

     */

    // solution 1
//    Vehicle() {
//        speed = 0;
//    }

    Vehicle(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        String output = "";

        output += "This is a Vehicle...";
        output += "\n" + manufacturer + " " + model;
        output += "\ntraveling at : " + speed;

        return output;
    }
}

public class Car extends Vehicle {
    private String vinNum;

    Car() {
        /*
        Option 2 (from how to fix constructor
        issue up in the Vehicle class)
        When I create a car...
        this constructor is going to go UP
        the inheritance chain
        and call ALL OTHER CONSTRUCTORS as needed
         */
        super(0);
    }

    public void stop() {
        // stuff happens...
        System.out.println("This car is stopping... took 5 seconds");
    }

    public String getVinNum() {
        return vinNum;
    }

    public void setVinNum(String vinNum) {
        this.vinNum = vinNum;
    }

    @Override
    public String toString() {
        return "\nCar with vinNum: " + vinNum
                + super.toString();
    }
}

class Truck extends Car{
    // private String vinNum;
    // instead of extends Vehicle,
    // we'll have Truck extend Car
    // so that it also inherits vinNumber
    private double towingCapacity;
    private double payload;
    private double bedSize;

    Truck() {
        super();
    }
    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        this.towingCapacity = towingCapacity;
    }

    public double getPayload() {
        return payload;
    }

    public void setPayload(double payload) {
        this.payload = payload;
    }

    public double getBedSize() {
        return bedSize;
    }

    public void setBedSize(double bedSize) {
        this.bedSize = bedSize;
    }

    public void towTrailer() {
        // change max speed to 65 mph
        // reduce payload, calculate max towing...
    }

    //@Override
    public void tow() {

    }

    // we can override methods that are UP in the inheritance chain
    // so.. behaviors that are defined in the Car or Vehicle class
    @Override // annotation.. note in code...
    public void stop() {
        System.out.println("this truck is stopping... and it took 7 seconds...");
    }

    @Override
    public String toString() {
        // a String representation
        // or summary of an object
        // of this class
        String output = "";

        output += "This is a truck.";
        if (bedSize != 0) {
            output += "\nBed size: " + bedSize;
        }
        output += "\nTowing capacity: " + towingCapacity;
        output += "\nPayload: " + payload;

        output += "\n" + super.toString();

        return output;
    }
}

class Bike extends Vehicle{
    private boolean wheelie;
    private boolean ev;
    private boolean hasBasket;



    Bike(boolean ev) {
        // similar to constructor chaining
        // within a class
        // the super constructor call
        // must be the first line in the constructor
        super(50);
        this.ev = ev;
    }

    public boolean isWheelie() {
        return wheelie;
    }

    public void setWheelie(boolean wheelie) {
        super.setSpeed(super.getSpeed()-10);
        this.wheelie = wheelie;
    }

    public boolean isEv() {
        return ev;
    }

    public void setEv(boolean ev) {
        this.ev = ev;
    }

    public boolean isHasBasket() {
        return hasBasket;
    }

    public void setHasBasket(boolean hasBasket) {
        this.hasBasket = hasBasket;
    }
}

class Scooter extends Vehicle{
    // if I'm not extending the class in some way
    // no reason to create a subclass

    Scooter() {
        super(1);
    }
}

class Main2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Truck t1 = new Truck();
        Bike b1 = new Bike(false);
        // Scooter is redundant
        Scooter s1 = new Scooter();
        // Instead...
        Vehicle scooter = new Vehicle(0);

        b1.setSpeed(50);
        b1.setWheelie(true);

        t1.stop();

        Truck t2 = t1;
        System.out.println(t1.equals(t2));

        System.out.println(t1.toString());

        // System.out.println(scooter.toString());

    }
}
