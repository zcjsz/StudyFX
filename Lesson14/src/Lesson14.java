import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Lesson14 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane anchorPane = new AnchorPane();

        Group group1 = new Group();
        Group group2 = new Group();

        Button btn1 = new Button("Btn1");
        Button btn2 = new Button("Btn2");
        Button btn3 = new Button("Btn3");
        Button btn4 = new Button("Btn4");
        Button btn5 = new Button("Btn5");
        Button btn6 = new Button("Btn6");

        anchorPane.setStyle("-fx-background-color:#C7C7C7");

// ====================================================================================================================
// ====================================================================================================================

        // 1. 设置 HBox，水平布局，子组件依次排列，宽度不够会缩小，不会换行，但是子组件缩到最小后会撑开HBox
        HBox hbox = new HBox();
        hbox.setStyle("-fx-background-color:#7EC0EE");
        hbox.setPrefWidth(100);
        hbox.setPrefHeight(200);
        hbox.getChildren().addAll(btn1, btn2, btn3);

        // 2. HBox 设置本组件的内边距 Padding
        hbox.setPadding(new Insets(10));

        // 3. HBox 设置子组件之间的间距
        hbox.setSpacing(5);

        // 4. HBox 设置子组件的外边距 Margin
        HBox.setMargin(btn1, new Insets(10));

        // 5. HBox 设置对齐方式
        hbox.setAlignment(Pos.CENTER);

// ====================================================================================================================

        // 6. 设置 VBox，垂直布局，子组件依次排列，高度不够会缩小，不会换列，但是子组件缩到最小后会撑开VBox
        VBox vbox = new VBox();
        vbox.setStyle("-fx-background-color:#CDCD00");
        vbox.setPrefWidth(200);
        vbox.setPrefHeight(0);
        vbox.getChildren().addAll(btn4, btn5, btn6);

        // 7. VBox 设置本组件的内边距 Padding
        vbox.setPadding(new Insets(10));

        // 8. VBox 设置子组件之间的间距
        vbox.setSpacing(5);

        // 9. VBox 设置子组件的外边距 Margin
        VBox.setMargin(btn4, new Insets(10));

        // 10. VBox 设置对齐方式
        vbox.setAlignment(Pos.BOTTOM_RIGHT);

        anchorPane.getChildren().addAll(hbox, vbox);
        AnchorPane.setLeftAnchor(vbox, 250.0);

// ====================================================================================================================
// ====================================================================================================================

        Scene scene = new Scene(anchorPane);

        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("JavaFX");
        primaryStage.show();

    }
}
