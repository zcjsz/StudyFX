import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;

public class Lesson4A extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // 设置透明度
        // primaryStage.setOpacity(0.5);

        // 设置窗口总是在最上层,默认为false
        // primaryStage.setAlwaysOnTop(true);

        primaryStage.show();

        // 设置窗口左上角起点,在show()执行后调用才起作用
        primaryStage.setX(500);
        primaryStage.setY(500);

        // 监听窗口坐标
        primaryStage.xProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("Window X addr = " + newValue.doubleValue());
            }
        });
        primaryStage.yProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("Window Y addr = " + newValue.doubleValue());
            }
        });

    }
}
