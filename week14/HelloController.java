package com.example.week14;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class HelloController {

    @FXML
    private ListView<RestaurantItem> inventoryListView;

    private void showAllInventory() {
        inventoryListView.getItems().clear();
        for (RestaurantItem each: HelloApplication.inventory) {
            inventoryListView.getItems().add(each);
        }
        inventoryListView.refresh();
    }

    public void initialize() {
        showAllInventory();
    }

}
