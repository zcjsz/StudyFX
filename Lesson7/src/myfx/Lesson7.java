package myfx;

import javafx.application.Application;
import javafx.application.HostServices;
import javafx.scene.Cursor;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;

public class Lesson7 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Stage 加载 Scene， Scene 加载布局， 布局加载节点

        Button btn1 = new Button("Btn1");
        btn1.setPrefHeight(20);
        btn1.setPrefWidth(50);
        btn1.setCursor(Cursor.HAND);

        Group group = new Group();
        group.getChildren().add(btn1);

        Scene scene = new Scene(group);

        // 可以设置指针的样式，也可以自定义指针样式

        URL url = getClass().getClassLoader().getResource("icon/icon.jpg");
        if(url!=null) scene.setCursor(Cursor.cursor(url.toExternalForm()));

        primaryStage.setScene(scene);
        primaryStage.setTitle("JavaFX");
        primaryStage.setWidth(800);
        primaryStage.setHeight(800);
        primaryStage.show();
        primaryStage.setX(400);
        primaryStage.setY(100);

        // 在程序中自动打开一个网页
        HostServices host = getHostServices();
        host.showDocument("www.baidu.com");
    }
}
