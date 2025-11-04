import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList blah = new ArrayList();
        // raw type warning
        // creating an ArrayList of objects
        blah.add("Hello");
        for (int i = 0; i < 500; i++) {
            blah.add(i);
        }
        System.out.println(blah); // implicitly calling blah.toString()
        System.out.println("This list is: " + blah.size() + " long");

        //blah.add(99);

        blah.remove(5);

        System.out.println(blah);

        System.out.println("This list is: " + blah.size() + " long");



        ArrayList<String> stuff2 = new ArrayList<>();
        // String[] stuff2;
        // using type parameter String
        // it's a piece of information that the class needs
        // in this case.. not a value of something
        // but the TYPE of something

        stuff2.add("hello");
        // stuff2.add(1);



        Room room1 = new Room();
        TechRoom room11 = new TechRoom();
        Room room12 = new Room();
        Room room2 = new TechRoom();
        Room room3 = new Gym();
        Room room4 = new GamingRoom();

        // polymorphic array

        Room[] building = {room1, room11, room12, room2, room3, room4};

        System.out.println(building[2]);

        Object[] stuff = {room1, "123", 123, 1.5, "Hello"};
        // 123 and 1.5 MUST BE OBJECTS
        // in other words, they are using
        // the wrapper classes Integer and Double

        room1 = room2; // TechRoom assigned to a Room
        room11 = (TechRoom)room12; // Room assigned to a TechRoom

        Scanner keyboard = new Scanner(System.in);
        Random rng = new Random();
        String name = "Mike";
        TechRoom techroom = new TechRoom();
        Car car = new Car();

        blahblah(keyboard);
        blahblah(rng);
        blahblah(name);
        blahblah(techroom);
        blahblah(car);

    }


    // generic programming
    // generic - general, opposite of specific
    // HIGHLY reusable
    static void scheduleMeeting(Room room) {
        room.setBooked(true);
    }

    static void blahblah (Object object) {
        // not very useful, though it works
        // because the Object class is TOO
        // general, so we can't do many useful
        // types of things here...
    }
}
class Car {

}
class Room /* extends Object */ {
    private String building;
    private boolean booked;

    public boolean isBooked() {
        return booked;
    }

    public void setBooked(boolean booked) {
        this.booked = booked;
    }

    @Override
    public String toString() {
        return  "building='" + building + '\'' +
                ", booked=" + booked;
    }
}

class TechRoom extends Room{
    private int numPCs;
    private boolean wireless;

    @Override
    public void setBooked(boolean booked) {
        super.setBooked(true);
        wireless = true;
    }

    @Override
    public String toString() {
        return  "numPCs=" + numPCs +
                ", wireless=" + wireless +
                "\n" + super.toString();
    }
}

class GamingRoom extends TechRoom {
    private String gpu;
    private int bigScreens;
}

class Gym extends Room {
    private String sport;
    private int numHoops;

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public int getNumHoops() {
        return numHoops;
    }

    public void setNumHoops(int numHoops) {
        this.numHoops = numHoops;
    }
}
