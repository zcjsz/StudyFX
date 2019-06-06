import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Lesson5B extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Platform.setImplicitExit 设置为 false 的时候，即使所有窗口都关闭了，程序也不会退出，需要调用 Platform.exit 退出程序
        Platform.setImplicitExit(false);
        primaryStage.show();
        // Platform.exit();
    }
}
