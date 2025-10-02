public class Bike {
    private double speed;
    private String model;

    private String vinNumber;

    public Bike() {

    }

    /*
    setters/getters
     */

    // setters (almost) always follow same pattern
    // public void set+variableName(variable type identifier)
    public void setSpeed(double newSpeed) {
        if (speed < 200) {
            speed = newSpeed;
        }
    }

    public void setModel(String newModel) {
        model = newModel;
    }

    // getters are simpler
    // public data type of thing you're trying to get
    // + get+variable name and no params
    public double getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public boolean sameSpeed(Bike anotherBike) {
        // speed
        if (speed == anotherBike.speed) {
            return true;
        } else {
            return false;
        }
    }
}

class BikeRace {
    public static void main(String[] args) {
        Bike bike = new Bike();
        //bike.speed = 500;
        bike.setSpeed(70);

        Bike bike2 = new Bike();
        bike2.setSpeed(71);

        if (bike.sameSpeed(bike2)) {
            System.out.println("They're traveling same speed");
        }

        if (bike2.sameSpeed(bike)) {
            // different perspective
        }



        //System.out.println(bike.speed);
        // instead
        System.out.println(bike.getSpeed());
    }


}
