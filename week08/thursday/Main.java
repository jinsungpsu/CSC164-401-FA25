//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // primitive type
        int primitiveNum = 5;

        // wrapper class
        Integer refNumber = 5;


        // this is an array of ref vars
        // NO objects... ZIP, ZERO, NADAAAAA
        Room[] eastBuilding = new Room[10];

        // I can point those ref vars (10 of them)
        // to various objects that I create later...
        // eastBuilding[5] = new Room("East", 250);


        // if i want all ten rooms, I must do it one at a time
        for (int i = 0; i < eastBuilding.length; i++) {
            eastBuilding[i] = new Room("East");
        }

        /*
        Same as:
        10 reference variables now pointing to 10 unique objects
        eastBuilding[0] = new Room("East");
        eastBuilding[1] = new Room("East");
        eastBuilding[2] = new Room("East");
        eastBuilding[3] = new Room("East");
        eastBuilding[4] = new Room("East");
        ...
        eastBuilding[9] = new Room("East");
         */


        Room r1 = new Room("West", 380);
        Room r2 = new Room("West", 303);

        // can define an array of ref vars and initialize with objects OR other ref vars which point
        Room[] westBuilding = {r1, r2, null, null, null, new Room("West"), eastBuilding[0]};

        changeFloor(r2, 1);

        System.out.println("R2's room # is: " + r2.getNumber());

        TechRoom w380 = new TechRoom();
        w380.setNumber(380);
        w380.setBuilding("West");
        w380.setEthernetPorts(20);


    }
    static void changeFloor(Room room, int change) {
        int newRoomNumber = room.getNumber() + change*100;
        room.setNumber(newRoomNumber);
    }

    static void changeFloor(Room room, String change) {
        int changeVal = Integer.parseInt(change);
        changeFloor(room, changeVal);
    }
}
class TechRoom extends Room {
    private int numComputers;
    private boolean wirelessAccess;
    private int ethernetPorts;

    public int getNumComputers() {
        return numComputers;
    }

    public void setNumComputers(int numComputers) {
        this.numComputers = numComputers;
    }

    public boolean isWirelessAccess() {
        return wirelessAccess;
    }

    public void setWirelessAccess(boolean wirelessAccess) {
        this.wirelessAccess = wirelessAccess;
    }

    public int getEthernetPorts() {
        return ethernetPorts;
    }

    public void setEthernetPorts(int ethernetPorts) {
        this.ethernetPorts = ethernetPorts;
    }
}

class EdRoom extends Room{

}

class Room {
    private int number;
    private String building;
    private int capacity;
    

    public Room() {

    }


    public Room(String building) {
        this.building = building;
    }

    public Room(String building, int number) {
        this(building);
        if (number > 0 && number < Integer.MAX_VALUE) {
            this.number = number;
        }
    }

    public Room(String building, int number, int capacity) {
        // Room(building, number);
        /*
        instead of repeating all the code
        from the other constructor
         */
        this(building, number);
        this.capacity = capacity;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
