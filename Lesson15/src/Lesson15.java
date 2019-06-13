import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class Lesson15 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane anchorPane = new AnchorPane();

        Group group1 = new Group();
        Group group2 = new Group();
        Group group3 = new Group();

        Button btn01 = new Button("Btn01");
        Button btn02 = new Button("Btn02");
        Button btn03 = new Button("Btn03");
        Button btn04 = new Button("Btn04");
        Button btn05 = new Button("Btn05");

        Button btn11 = new Button("Btn11");
        Button btn12 = new Button("Btn12");
        Button btn13 = new Button("Btn13");
        Button btn14 = new Button("Btn14");
        Button btn15 = new Button("Btn15");

        Button btn21 = new Button("Btn21");
        Button btn22 = new Button("Btn22");
        Button btn23 = new Button("Btn23");
        Button btn24 = new Button("Btn24");
        Button btn25 = new Button("Btn25");

        HBox hbox1 = new HBox();
        HBox hbox2 = new HBox();
        HBox hbox3 = new HBox();

        VBox vbox = new VBox();

        Label label1 = new Label("setManaged(false)");
        Label label2 = new Label("setOpacity(0.5)");
        Label label3 = new Label("setVisible(false)");

// ====================================================================================================================
// ====================================================================================================================

        hbox1.setStyle("-fx-background-color:#6495ED");
        hbox1.setPadding(new Insets(10));
        hbox1.setPrefWidth(500);
        hbox1.setPrefHeight(50);
        hbox1.setSpacing(5);

        hbox2.setStyle("-fx-background-color:#6495ED");
        hbox2.setPadding(new Insets(10));
        hbox2.setPrefWidth(500);
        hbox2.setPrefHeight(50);
        hbox2.setSpacing(5);

        hbox3.setStyle("-fx-background-color:#6495ED");
        hbox3.setPadding(new Insets(10));
        hbox3.setPrefWidth(500);
        hbox3.setPrefHeight(50);
        hbox3.setSpacing(5);

        hbox1.getChildren().addAll(btn01, btn02, btn03, btn04, btn05);
        hbox2.getChildren().addAll(btn11, btn12, btn13, btn14, btn15);
        hbox3.getChildren().addAll(btn21, btn22, btn23, btn24, btn25);

        hbox1.setLayoutY(25);
        label1.setLayoutX(10);
        label1.setFont(Font.font(16));

        hbox2.setLayoutY(25);
        label2.setLayoutX(10);
        label2.setFont(Font.font(16));

        hbox3.setLayoutY(25);
        label3.setLayoutX(10);
        label3.setFont(Font.font(16));

        group1.getChildren().addAll(label1, hbox1);
        group2.getChildren().addAll(label2, hbox2);
        group3.getChildren().addAll(label3, hbox3);

        vbox.getChildren().addAll(group1, group2, group3);
        vbox.setSpacing(20);

        anchorPane.getChildren().add(vbox);
        anchorPane.setStyle("-fx-background-color:#C7C7C7");
        AnchorPane.setTopAnchor(vbox, 20.0);

        // 1. 被父组件管理，如果 false，组件不显示，组件位置空出来被后面组件填充
        btn03.setManaged(false);

        // 2. 设置组件透明度
        btn13.setOpacity(0.5);

        // 3. 设置组件可显示，如果 false，组件不显示，组件位置仍占用
        btn23.setVisible(false);

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
