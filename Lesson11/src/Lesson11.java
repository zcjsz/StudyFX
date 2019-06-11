import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.Mnemonic;
import javafx.stage.Stage;

public class Lesson11 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(group);

        Button btn1 = new Button("Btn1");
        Button btn2 = new Button("Btn2");

        btn1.setLayoutX(0);
        btn1.setLayoutY(0);

        btn2.setLayoutX(100);
        btn2.setLayoutY(0);

        group.getChildren().add(btn1);
        group.getChildren().add(btn2);

        // 设置快捷键 - Mnemonic
        KeyCombination kc1 = new KeyCodeCombination(KeyCode.C, KeyCombination.SHORTCUT_DOWN, KeyCombination.ALT_DOWN);
        Mnemonic mnemonic = new Mnemonic(btn1, kc1);
        scene.addMnemonic(mnemonic);

        // 设置快捷键 - getAccelerators
        KeyCombination kc2 = new KeyCodeCombination(KeyCode.Z, KeyCombination.SHORTCUT_DOWN, KeyCombination.ALT_DOWN);
        scene.getAccelerators().put(kc2, new Runnable() {
            @Override
            public void run() {
                System.out.println("btn2 pressed");
            }
        });


        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("JavaFX");
        primaryStage.show();

        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("btn1 pressed");
            }
        });

        btn2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("btn2 pressed");
            }
        });

    }
}
