import javafx.application.Application;
import javafx.stage.Stage;

public class Lesson4 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // 设置透明度
        // primaryStage.setOpacity(0.5);

        // 设置窗口总是在最上层,默认为false
        // primaryStage.setAlwaysOnTop(true);

        // 设置窗口左上角起点
        primaryStage.setX(500);
        primaryStage.setY(500);

        primaryStage.show();


    }
}
