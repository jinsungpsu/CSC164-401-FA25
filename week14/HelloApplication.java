package com.example.week14;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class RestaurantItem {
    private String name;
    private double price;

    public RestaurantItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "RestaurantItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

class Food extends RestaurantItem {
    private double calories;

    public Food(String name, double price, double calories) {
        super(name, price);
        this.calories = calories;
    }

    @Override
    public String toString() {
        return "Food{" +
                "calories=" + calories +
                "} " + super.toString();
    }
}

class GiftCard extends RestaurantItem {
    private double balance;
    private String message;

    public GiftCard(String name, double price, double balance, String message) {
        super(name, price);
        this.balance = balance;
        this.message = message;
    }

    @Override
    public String toString() {
        return "GiftCard{" +
                "balance=" + balance +
                ", message='" + message + '\'' +
                "} " + super.toString();
    }
}

public class HelloApplication extends Application {
    public static ArrayList<RestaurantItem> inventory = new ArrayList<>();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    static private void makeGiftCard(String itemDataCSV) {
//        Scanner keys = new Scanner(System.in);
//        // make a gift card
//        String gcName = keys.next();
//        double gcPrice = keys.nextDouble();
//        double gcBalance = keys.nextDouble();
//        String gcMessage = keys.next();
        String[] splitData = itemDataCSV.split(",");
        String gcName = splitData[0].trim();
        String gcMessage = splitData[1].trim();
        double gcPrice = Double.parseDouble(splitData[2].trim());
        double gcBalance = Double.parseDouble(splitData[3].trim());
        GiftCard card = new GiftCard(gcName, gcPrice, gcBalance, gcMessage);
        // String name, double price, double balance, String message

        inventory.add(card);

    }

    static private void makeFood(String itemDataCSV) {
        // 0: name
        // 1: calories
        // 2: price
        String[] splitData = itemDataCSV.split(",");
        String name = splitData[0].trim();
        double price = Double.parseDouble(splitData[2].trim());
        double calories = Double.parseDouble(splitData[1].trim());
        Food card = new Food(name, calories, price);
        // String name, double price, double balance, String message

        inventory.add(card);

    }


    public static void main(String[] args) {
        File inputFile = new File("stuff.txt");
        try {
            Scanner inventoryInput = new Scanner(inputFile);
            while(inventoryInput.hasNextLine()) {
                String data = inventoryInput.nextLine();
                String[] splitData = data.split(",");
                if (splitData[0].trim().equals("giftcard")) {
                    makeGiftCard(data);
                } else {
                    makeFood(data);
                }
            }

            System.out.println(inventory);
        } catch (IOException error) {
            // deal with the error
        } catch (IndexOutOfBoundsException error) {

        } catch (ArithmeticException error) {

        } catch (Exception error) {

        }

        launch();
    }
}
