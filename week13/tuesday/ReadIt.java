package com.example.csc164week13;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

class Post {
    private String title, content;

    private boolean popular;

    public Post(String title, String content, boolean popular) {
        this.title = title;
        this.content = content;
        this.popular = popular;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isPopular() {
        return popular;
    }

    public void setPopular(boolean popular) {
        this.popular = popular;
    }

    @Override
    public String toString() {
        return "Post{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}

public class ReadIt extends Application {
    // this is NOT a good way of doing this
    // a real application would use an external database
    public static ArrayList<Post> postsFakeDB = new ArrayList<>();

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(ReadIt.class.getResource("popular-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1024, 768);
        stage.setTitle("ReadIt - Popular Posts");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        postsFakeDB.add(new Post("Panda eats carrots!", "Yesterday a panda at deltech was found roaming the West building eating carrots.", true));
        postsFakeDB.add(new Post("Dak Prescott scores more touchdowns!", "THis might seem like amazing news, but he only seems to do it in games that don't matter against teams that aren't very good.  So eagles fans are not worried.", false));
        postsFakeDB.add(new Post("President Branard runs for US Senate", "In breaking news, Mark Branard of DelTech is running for office.", false));
        launch();
    }
}
