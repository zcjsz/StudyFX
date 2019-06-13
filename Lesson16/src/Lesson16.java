import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Lesson16 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        AnchorPane anchorPaneTop = new AnchorPane();
        AnchorPane anchorPaneRight = new AnchorPane();
        AnchorPane anchorPaneBottom = new AnchorPane();
        AnchorPane anchorPaneLeft = new AnchorPane();
        AnchorPane anchorPaneCenter = new AnchorPane();

        anchorPaneCenter.setStyle("-fx-background-color: #436EEE");

        anchorPaneTop.setStyle("-fx-background-color: #FF6347");
        anchorPaneTop.setPrefWidth(500);
        anchorPaneTop.setPrefHeight(50);

        anchorPaneBottom.setStyle("-fx-background-color: #98FB98");
        anchorPaneBottom.setPrefWidth(500);
        anchorPaneBottom.setPrefHeight(50);

        anchorPaneLeft.setStyle("-fx-background-color: #8968CD");
        anchorPaneLeft.setPrefWidth(50);
        anchorPaneLeft.setPrefHeight(400);

        anchorPaneRight.setStyle("-fx-background-color: #BC8F8F");
        anchorPaneRight.setPrefWidth(50);
        anchorPaneRight.setPrefHeight(400);

// ====================================================================================================================
// ====================================================================================================================

        // 1. BorderPane 设置方位布局，上、下、左、右、中，每个方位都能添加一个节点
        // 2. BorderPane 如果上下左右的节点没有设置宽和高，那整个空间都被中间的节点填充
        BorderPane borderPane = new BorderPane();
        borderPane.setStyle("-fx-background-color: #CCCCCC");
        borderPane.setTop(anchorPaneTop);
        borderPane.setRight(anchorPaneRight);
        borderPane.setBottom(anchorPaneBottom);
        borderPane.setLeft(anchorPaneLeft);
        borderPane.setCenter(anchorPaneCenter);

        // 3. BorderPane 设置本组件内边距
        borderPane.setPadding(new Insets(10));

        // 4. BorderPane 设置子组件外边距
        BorderPane.setMargin(anchorPaneTop, new Insets(10));

        // 5. BorderPane 获取某个方位的子节点
        System.out.println(((AnchorPane) borderPane.getTop()));

// ====================================================================================================================
// ====================================================================================================================

        Scene scene = new Scene(borderPane);

        primaryStage.setScene(scene);
        primaryStage.setWidth(500);
        primaryStage.setHeight(500);
        primaryStage.setTitle("JavaFX");
        primaryStage.show();

    }
}
