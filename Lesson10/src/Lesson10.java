import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class Lesson10 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Group group = new Group();
        Scene scene = new Scene(group);

        Button btn1 = new Button("Btn1");

        group.getChildren().add(btn1);

        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("JavaFX");
        primaryStage.show();


        // 鼠标单击事件
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("鼠标单击事件");
            }
        });

        // 鼠标双击事件
        btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getClickCount() > 1 && event.getButton().name().equals(MouseButton.PRIMARY.name()))
                    System.out.println("鼠标双击事件");
            }
        });

        // 鼠标按键名称
        btn1.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if(event.getButton().name().equals(MouseButton.PRIMARY.name()))   System.out.println("鼠标左键");
                if(event.getButton().name().equals(MouseButton.SECONDARY.name())) System.out.println("鼠标右键");
                if(event.getButton().name().equals(MouseButton.MIDDLE.name()))    System.out.println("鼠标中键");
            }
        });

        // 键盘按键事件
        btn1.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if(event.getCode().getName().equalsIgnoreCase("A")) {
                    System.out.println(event.getCode().getName() + " key pressed");
                }
            }
        });

        btn1.setOnKeyReleased(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                System.out.println(event.getCode().getName() + " key released");
            }
        });

    }
}
