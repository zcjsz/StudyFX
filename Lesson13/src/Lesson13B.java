import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Lesson13B extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // 1. Group 是捆绑容器，不是组件也不是布局，不能添加背景和事件等
        Group group1 = new Group();
        Group group2 = new Group();
        Button btn1 = new Button("Btn1");
        Button btn2 = new Button("Btn2");
        Button btn3 = new Button("Btn3");
        Button btn4 = new Button("Btn4");

// --------------------------------------------------------------------------------------------------------------------

        // 7. 在 AnchorPane 里面嵌套另一个 AnchorPane: AnchorPane1 管理 AnchorPane2, AnchorPane2 管理 Button1
        AnchorPane anchorPane1 = new AnchorPane();
        AnchorPane anchorPane2 = new AnchorPane();
        anchorPane1.setStyle("-fx-background-color:#C7C7C7");
        anchorPane2.setStyle("-fx-background-color:#66CDAA");
        AnchorPane.setTopAnchor(anchorPane2, 0.0);
        AnchorPane.setRightAnchor(anchorPane2, 0.0);
        AnchorPane.setBottomAnchor(anchorPane2, 0.0);
        AnchorPane.setLeftAnchor(anchorPane2, 0.0);

        // 8. AnchorPane 监听宽高
        anchorPane1.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                AnchorPane.setRightAnchor(anchorPane2, anchorPane1.getWidth()/2);
                System.out.println(String.format("AnchorPane1 width newValue = %f, width getWidth = %f", newValue.floatValue(), anchorPane1.getWidth()));
            }
        });

        anchorPane1.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                AnchorPane.setBottomAnchor(anchorPane2, anchorPane1.getHeight()/2);
                System.out.println(String.format("AnchorPane1 height newValue = %f, height getHeight = %f", newValue.floatValue(), anchorPane1.getHeight()));
            }
        });

        // 9. 在子 AnchorPane 中添加 Button，并且固定到右下角
        anchorPane2.getChildren().add(btn1);
        AnchorPane.setRightAnchor(btn1, 0.0);
        AnchorPane.setBottomAnchor(btn1, 0.0);

        // 10. Button1 脱离 AnchorPane2 管理，Button1 不在原来位置
        btn1.setManaged(false);

// ====================================================================================================================
// ====================================================================================================================

        anchorPane1.getChildren().add(anchorPane2);
        Scene scene = new Scene(anchorPane1);

        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("JavaFX");
        primaryStage.show();

        // 在 primaryStage.show() 后面再获取组件的宽高
    }
}


