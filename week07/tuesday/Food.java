public class Food {
    private String name;
    private String allergens;
    private double price;

    Food(String name, double price, String allergens) {
        this.name = name;
        this.price = price;
        this.allergens = allergens;
    }

    public String getName() {
        return name;
    }

    public String getAllergens() {
        return allergens;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private Food item1, item2;
    private double totalCost;
    private String customerName;
}

class Restaurant {
    public static void main(String[] args) {
        Food[] menu = {
                new Food("Burger", 5.99, "Gluten, Dairy"),
                new Food("Salad", 4.49, "Nuts"),
                new Food("Pizza", 8.99, "Gluten, Dairy"),
                new Food("Soup", 3.99, "None"),
                new Food("Pasta", 7.49, "Gluten, Dairy")
        };

        System.out.println("Welcome to Java Bites Restaurant!");
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i].getName() + " - $" + menu[i].getPrice() + " (Contains: " + menu[i].getAllergens() + ")");
        }

        String name = "Alex";
        int choice1 = 2;
        int choice2 = 3;

        // creates an empty order
        Order order = new Order();
        // then set
        order.setItem1(menu[choice1-1]);
        order.setItem2(menu[choice2-1]);

        System.out.println("What did they order");
        System.out.println("First item is:");
        System.out.println(order.getItem1().getName());

    }
}
