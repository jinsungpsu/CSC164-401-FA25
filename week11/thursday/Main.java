import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle(50);
        Car v2 = new Car(20);
        EV v3 = new EV();
        Garage garage = new Garage();
        garage.addVehicle(v1);
        garage.addVehicle(v2);
        garage.addVehicle(v3);

        System.out.println("All vehicles in my garage: " + garage);
        System.out.println("Their total milage is: " + garage.getMilesForGarageVehicles());
    }
}

class Garage {
    private ArrayList<Vehicle> vehicles = new ArrayList<>();
    private double totalMiles = 0;

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public double getMilesForGarageVehicles() {
        totalMiles = 0;
        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle each = vehicles.get(i);
            totalMiles += each.getMileage();
            // same as
            // totalMiles += each.get(i).getMiles();
        }

        // do it again suing for each
        totalMiles = 0;
        for (Vehicle each: vehicles) {
            totalMiles += each.getMileage();
        }
        return totalMiles;
    }

    @Override
    public String toString() {
        /*
        I can take advantage of the toString method
        of the ArrayList clas and NOT use a loop
        However, I'd prefer to have more control
        over how things are formatted.
         */
        String o = "";
        for (Vehicle each: vehicles) {
            o += each + "\n";
        }
        return o;
    }

}

// most general
class Vehicle {
    private double speed;
    private double mileage;

    Vehicle(double speed) {
        mileage = 10;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String toString() {
        /*
        just a single return statement

        or Mr. An's preferred in CS2
        "build" a string using +=
        */
        String output = "";
        output+="Vehicle traveling at: ";
        output+=this.speed;
        return output;
    }
}
class Car extends Vehicle{
    private String vin;

    public Car(double speed) {
        super(speed);
    }

    public Car() {
        super(0);
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCar with vin: " + vin;
    }
}
// most specific
class EV extends Car {
    private double batteryLevel;

    @Override
    public String toString() {
        return super.toString() +
                "\nEV battery level: " +
                batteryLevel;
    }
}
