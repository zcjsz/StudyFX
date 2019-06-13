import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Lesson13A extends Application {

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

        btn1.setLayoutX(20);
        btn1.setLayoutY(20);
        btn3.setLayoutX(20);
        btn3.setLayoutY(20);

// --------------------------------------------------------------------------------------------------------------------

        // 2. AnchorPane 定位布局(绝对布局)，可以作为根节点。作为组件可以设置背景事件等。
        AnchorPane anchorPane = new AnchorPane();
        anchorPane.setStyle("-fx-background-color:#C7C7C7");
        anchorPane.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("AnchorPane clicked.");
            }
        });

        // 3. AnchorPane 通过锚点来管理子组件在其中间的位置，使子组件自己设置的 X,Y 无效
        // AnchorPane.setTopAnchor(btn1, 100.0);  // btn1 距离父控件上边 100.0 像素
        // AnchorPane.setLeftAnchor(btn1, 100.0); // btn1 距离父控件左边 100.0 像素
        // AnchorPane.setTopAnchor(btn2, 200.0);
        // AnchorPane.setLeftAnchor(btn2, 200.0);
        // btn1.setLayoutX(10);  btn1.setLayoutY(10);  // 这行设置无效，其位置已经被父组件管理
        // btn2.setLayoutX(100); btn2.setLayoutY(10);  // 这行设置无效，其位置已经被父组件管理

        // 4. AnchorPane 中的子组件可以通过锚点位置来自适应父控件大小
        // AnchorPane.setTopAnchor(btn1, 10.0);
        // AnchorPane.setRightAnchor(btn1, 10.0);
        // AnchorPane.setBottomAnchor(btn1, 10.0);
        // AnchorPane.setLeftAnchor(btn1, 10.0);

        // 5. AnchorPane 设置内边距，只对设置锚点的子组件有效
        // anchorPane.setPadding(new Insets(10));
        // AnchorPane.setTopAnchor(btn1, 0.0);
        // AnchorPane.setLeftAnchor(btn1, 0.0);

        // 6. 通过 AnchorPane 来管理 Group，设置 Group 锚点位置。Button X,Y 位置是相对于 Group 的。
        group1.getChildren().addAll(btn1, btn2);
        group2.getChildren().addAll(btn3, btn4);
        anchorPane.getChildren().addAll(group1, group2);
        AnchorPane.setTopAnchor(group1, 100.0);
        AnchorPane.setLeftAnchor(group1, 100.0);
        AnchorPane.setTopAnchor(group2, 0.0);
        AnchorPane.setLeftAnchor(group2, 0.0);


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
