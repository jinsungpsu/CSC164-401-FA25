package com.example.csc164week13;

import javafx.fxml.FXML;
import javafx.scene.input.*;
import javafx.scene.control.*;
import javafx.event.ActionEvent;

public class PopullarViewController {
    @FXML
    private TextField newTitle_textField;

    @FXML
    private ListView<Post> postsListView;

    @FXML
    private Label postsLabel;

    @FXML
    private TextArea postsTextArea;

    @FXML
    void showAllPostsHandler(MouseEvent event) {
        postsTextArea.setText(ReadIt.postsFakeDB.toString());
    }

    @FXML
    void changePostTitleHandler(ActionEvent event) {
        Post selectedPost = postsListView.getSelectionModel().getSelectedItem();

        if (postsListView != null) {
            selectedPost.setTitle(newTitle_textField.getText());
            postsListView.refresh();
        }
    }

    @FXML
    void showPopularPostsHandler(MouseEvent event) {
        String o = "";
        for (Post each: ReadIt.postsFakeDB) {
            if (each.isPopular()) {
                o += each;
            }
        }
        postsTextArea.setText(o.toString());
    }

    public void initialize() {
        // label is fine, but it's really not meant for
        // this purpose
        // meaning a huge list of posts
        postsLabel.setText(ReadIt.postsFakeDB.toString());

        // text area is a little better
        // this class has some functionality built in
        // for larger text
        // such as wrapping text
        // and scroll bars
        postsTextArea.setText(ReadIt.postsFakeDB.toString());

        // finally, ListView is a MUCH better
        // candidate here
        // because it's a class for viewing lists of things
        for (Post each: ReadIt.postsFakeDB) {
            postsListView.getItems().add(each);
        }

    }

}
