import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Lesson9 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(group);

        Button btn1 = new Button("Btn1");
        Button btn2 = new Button("Btn2");

        // 设置按钮文字
        btn1.setText("Btn1");
        btn2.setText("Btn2");

        // 设置按钮大小
        btn1.setPrefWidth(100);
        btn1.setPrefHeight(50);
        btn2.setPrefWidth(50);
        btn2.setPrefHeight(50);

        // 设置按钮位置
        btn1.setLayoutX(100);
        btn1.setLayoutY(100);
        btn2.setLayoutX(25);
        btn2.setLayoutY(25);

        // 设置按钮字体和大小
        btn1.setFont(Font.font("Arial", 20));

        // 设置按钮字体颜色
        btn1.setTextFill(Paint.valueOf("#DC143C"));

        // 设置按钮背景
        BackgroundFill bgf = new BackgroundFill(Paint.valueOf("#98FB98"), new CornerRadii(10), new Insets(10));
        Background bg = new Background(bgf);
        btn1.setBackground(bg);

        // 设置按钮边框
        BorderStroke borderStroke = new BorderStroke(Paint.valueOf("#3B3B3B"), BorderStrokeStyle.SOLID, new CornerRadii(0), new BorderWidths(5));
        Border border = new Border(borderStroke);
        btn1.setBorder(border);

        // 设置按钮透明度
        btn1.setOpacity(0.5);


        // 通过css设置按钮样式, https://docs.oracle.com/javafx/2/api/javafx/scene/doc-files/cssref.html#intro
        btn2.setStyle(
                "-fx-background-color : #CFCFCF;" +
                "-fx-background-radius : 5;" +
                "-fx-text-fill : #9B30FF"
        );

        // 设置按钮单击事件
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button btn = (Button) event.getSource();
                System.out.println(btn.getText() + " clicked");
            }
        });


        group.getChildren().add(btn1);
        group.getChildren().add(btn2);

        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("JavaFX");
        primaryStage.show();primaryStage.show();

    }
}

