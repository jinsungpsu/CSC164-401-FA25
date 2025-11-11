package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.shape.Circle;

public class ClickerViewController {
    private int numCookies;
    private Cursor clicker = new Cursor(0);

    @FXML
    private Circle cookie;

    @FXML
    private Label cookiesLabel;

    @FXML
    private Label levelLabel;

    @FXML
    void mouseClickedHandler(MouseEvent event) {
        // either of these work
        // different ways of storing things

        numCookies += clicker.clickPower();
        // CookieClickerApp.numCookies++; // should probably be private and use setter

        cookiesLabel.setText(String.valueOf(numCookies));
//        System.out.println("num cookies: " + numCookies);
//        String name = "John Wick " + 4;
        if (numCookies%1000 == 0) {
            clicker.levelUp();
            levelLabel.setText(clicker.getLevel()+"");
        }
    }

    public void initialize() {
        cookiesLabel.setText("0");
        levelLabel.setText("0");
    }

    @FXML
    void cheatCodeHandler(MouseEvent event) {
        for(int i = 0; i < 20; i++) {
            mouseClickedHandler(event);
        }
    }

}
