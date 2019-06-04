import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Lesson3 extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        // 设置 Title
        primaryStage.setTitle("JavaFX");

        // 设置 Icon
        primaryStage.getIcons().add(new Image("/icon/icon.jpg"));

        // 设置最小化
        // primaryStage.setIconified(true);

        // 设置最大化
        // primaryStage.setMaximized(true);

        // 设置宽高
        // primaryStage.setWidth(500);
        // primaryStage.setHeight(500);

        // 设置最大宽高
        // primaryStage.setMaxWidth(800);
        // primaryStage.setMaxHeight(800);

        // 设置最小宽高
        // primaryStage.setMinWidth(300);
        // primaryStage.setMinHeight(300);

        // 设置不可改变大小
        // primaryStage.setResizable(false);

        // 获取宽和高
        // System.out.println("宽度 = " + primaryStage.getWidth());
        // System.out.println("高度 = " + primaryStage.getHeight());

        // 监听宽度
        primaryStage.widthProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("当前宽度 = " + newValue.floatValue());
            }
        });

        // 监听高度
        primaryStage.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
                System.out.println("当前高度 = " + newValue.floatValue());
            }
        });

        // 设置全屏，必须设置 Scene
        // primaryStage.setFullScreen(true);
        // primaryStage.setScene(new Scene(new Group()));

        primaryStage.show();

        // 关闭窗口
        // primaryStage.close();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
