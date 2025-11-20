package com.example.csc164week13;

import javafx.fxml.FXML;
import javafx.scene.input.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class FrontPageViewController {
    @FXML
    private CheckBox popularCheckBox;

    @FXML
    private TextField newTitle_textField;

    @FXML
    private ListView<Post> postsListView;

    @FXML
    void postsListViewClickedHandler(MouseEvent event) {
        Post selectedPost = postsListView.getSelectionModel().getSelectedItem();
        if (selectedPost != null) {
            newTitle_textField.setText(selectedPost.getTitle());
            popularCheckBox.setSelected(selectedPost.isPopular());
        }
    }

    @FXML
    void popularCheckBoxHandler(ActionEvent event) {
        // don't actually need this
        // i'm gonna use the change button
    }

    @FXML
    void showAllPostsHandler(MouseEvent event) {
        resetPosts();
    }

    private void resetPosts() {
        // finally, ListView is a MUCH better
        // candidate here
        // because it's a class for viewing lists of things
        postsListView.getItems().clear();
        for (Post each: ReadIt.postsFakeDB) {
            postsListView.getItems().add(each);
        }
        postsListView.refresh();
    }


    @FXML
    void changePostTitleHandler(ActionEvent event) {
        Post selectedPost = postsListView.getSelectionModel().getSelectedItem();

        if (postsListView != null) {
            selectedPost.setTitle(newTitle_textField.getText());
            selectedPost.setPopular(popularCheckBox.isSelected());
            postsListView.refresh();
        }
    }

    @FXML
    void showPopularPostsHandler(MouseEvent event) {
// this is before we changed the main interface to use a ListView
        //        String o = "";
//        for (Post each: ReadIt.postsFakeDB) {
//            if (each.isPopular()) {
//                o += each;
//            }
//        }
        postsListView.getItems().clear();
        for (Post each: ReadIt.postsFakeDB) {
            if (each.isPopular()) {
                postsListView.getItems().add(each);
            }
        }
        postsListView.refresh();
    }

    public void initialize() {
        filepractice();

        resetPosts();
    }

    private void filepractice() {
        String filename = "D:\\Users\\jan.DTCC\\Desktop\\CSC164-FA25\\Week13\\csc164-week13\\src\\main\\resources\\myfile2.txt";
        try {
            Scanner fileInput = new Scanner(new File("myfile1.txt"));
            System.out.println(fileInput.nextLine());
            Scanner absolutePathFile = new Scanner(new File(filename));
            System.out.println(absolutePathFile.nextLine());
        } catch (FileNotFoundException error) {
            System.out.println("The error is: " + error);
            System.out.println("Oh... file not found?");
            System.out.println("How should we proceed?");
            System.out.println("Create a new file??");
        }

        int[] arr = {1,2,3};
        try {
            System.out.println(arr[4]);
        } catch (IndexOutOfBoundsException error) {
            System.out.println("You can't do that buddy");
        }

        int input;

        Scanner keyboard = new Scanner(System.in);

        while(true) {
            try {
                System.out.println("Enter a number: ");
                input = keyboard.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("You didn't enter an integer");
                keyboard.next();
                continue;
            }
        }
    }


}
