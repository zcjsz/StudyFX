import javafx.application.Application;
import javafx.collections.ListChangeListener;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Lesson8 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Button b1 = new Button("Btn1");
        Button b2 = new Button("Btn2");
        Button b3 = new Button("Btn3");

        // 在 group 中控制组件位置
        b1.setLayoutX(0);
        b1.setLayoutY(0);

        b2.setLayoutX(50);
        b2.setLayoutY(50);

        b3.setLayoutX(100);
        b3.setLayoutY(100);

        // 手动设置子组件大小
        b2.setPrefWidth(50);
        b2.setPrefHeight(50);

        // group 自动设置子组件大小，默认是true，如果设置false则子组件大小为0不能显示
        // group.setAutoSizeChildren(true);

        // 向 group 中添加组件
        Group group = new Group();
        // group.getChildren().add(b1);
        // group.getChildren().add(b2);
        // group.getChildren().add(b3);
        group.getChildren().addAll(b1,b2,b3);

        // group 移除某个组件
        // group.getChildren().remove(b1);

        // group 移除所有组件
        // group.getChildren().clear();

        // group 捆绑子组件，对 group 设置会直接作用到所有子组件
        group.setOpacity(0.5);

        // group 检测在某位置是否存在子组件，实际只检测子组件的左上角起始点位置
        System.out.println(group.contains(0,0)); // true
        System.out.println(group.contains(0,1)); // false

        // 添加 Btn1 按钮事件
        b1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Button b4 = new Button("Btn4");
                b4.setLayoutX(150);
                b4.setLayoutY(150);
                group.getChildren().add(b4);
            }
        });

        // group children list 监听事件
        group.getChildren().addListener(new ListChangeListener<Node>() {
            @Override
            public void onChanged(Change<? extends Node> c) {
                System.out.println("当前子组件数量: " + c.getList().size());
            }
        });



        Scene scene = new Scene(group);

        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("JavaFX");
        primaryStage.show();


    }
}

