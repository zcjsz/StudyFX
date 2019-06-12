import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Tooltip;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.Date;

public class Lesson12 extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(group);

        // 1. 添加文本框
        TextField textField = new TextField();
        textField.setLayoutX(10);
        textField.setLayoutY(10);

        // 2. 文本框字体设置
        textField.setFont(Font.font("Arial", 14));

        // 3. 文本框提示文字
        Tooltip toolTip = new Tooltip("This is Tool Tip ...");
        toolTip.setFont(Font.font(20));
        textField.setTooltip(toolTip);

        // 4. 文本框占位信息
        textField.setPromptText("This is placeholder info ...");

        // 5. 文本框默认失焦
        textField.setFocusTraversable(false);

        // 6. 文本框输入监听 - 限制用户输入字数
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if(newValue.length() > 5) textField.setText(oldValue);
            }
        });

        // 7. 文本框选择文字监听
        textField.selectedTextProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
            }
        });

        // 8. 文本框单击事件
        textField.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("TextField Clicked " + new Date().toString());
            }
        });


// ====================================================================================================================
// ====================================================================================================================

        // 9. 添加密码框
        PasswordField passwordField = new PasswordField();
        passwordField.setLayoutX(10);
        passwordField.setLayoutY(50);

        passwordField.setFont(Font.font("Arial", 14));
        passwordField.setPromptText("Input Password ...");

        passwordField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                System.out.println(newValue);
            }
        });


// ====================================================================================================================
// ====================================================================================================================

        // 10. 添加标签
        Label label = new Label("This is Label.");
        label.setLayoutX(10);
        label.setLayoutY(100);
        label.setFont(Font.font("Arial", 14));
        label.setTextFill(Paint.valueOf("#1C86EE"));

        // 11. 标签鼠标左键单击事件
        label.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getButton().name().equals("PRIMARY"))
                    System.out.println("Label Clicked " + new Date().toString());
            }
        });

// ====================================================================================================================
// ====================================================================================================================

        group.getChildren().add(textField);
        group.getChildren().add(passwordField);
        group.getChildren().add(label);

        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("JavaFX");
        primaryStage.show();


    }
}
