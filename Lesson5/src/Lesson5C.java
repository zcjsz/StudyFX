import javafx.application.Application;
import javafx.application.ConditionalFeature;
import javafx.application.Platform;
import javafx.stage.Stage;

public class Lesson5C extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // Platform.isSupported 检查系统是否支持一些特性
        System.out.println(Platform.isSupported(ConditionalFeature.SCENE3D));
        System.out.println(Platform.isSupported(ConditionalFeature.GRAPHICS));
        System.out.println(Platform.isSupported(ConditionalFeature.SWING));

        Platform.exit();

    }
}
