import javafx.application.Application;
import javafx.application.Platform;
import javafx.geometry.Rectangle2D;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class Lesson6 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Screen screen = Screen.getPrimary();

        // 获取整个屏幕的边界
        Rectangle2D bounds = screen.getBounds();

        // 获取可视屏幕的边界
        Rectangle2D visualBounds = screen.getVisualBounds();

        System.out.println("整个屏幕的边界信息 : " + bounds);
        System.out.println(String.format("整个屏幕: 左上角 X = %f, 左上角 Y = %f, 右下角 X = %f, 右下角 X = %f", bounds.getMinX(), bounds.getMinY(), bounds.getMaxX(), bounds.getMaxY()));

        System.out.println("可视屏幕的边界信息 : " + visualBounds);
        System.out.println(String.format("可视屏幕: 左上角 X = %f, 左上角 Y = %f, 右下角 X = %f, 右下角 X = %f", visualBounds.getMinX(), visualBounds.getMinY(), visualBounds.getMaxX(), visualBounds.getMaxY()));

        double dpi = screen.getDpi();
        System.out.println("当前屏幕 DPI : " + dpi);

        Platform.exit();

    }
}
