import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Lesson4B extends Application {

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {

        // 窗口默认样式，有标题栏
        Stage s1 = new Stage();
        s1.setTitle("S1");
        s1.initStyle(StageStyle.DECORATED);
        s1.show();


        // 透明背景，没有标题栏。有背景布局后才能看出差别。
        /*
        Stage s2 = new Stage();
        s2.setTitle("S2");
        s2.initStyle(StageStyle.TRANSPARENT);
        s2.show();
         */

        // 没有标题栏
        /*
        Stage s3 = new Stage();
        s3.setTitle("S3");
        s3.initStyle(StageStyle.UNDECORATED);
        s3.show();
         */

        Stage s4 = new Stage();
        s4.setTitle("S4");
        s4.initStyle(StageStyle.UNIFIED);
        s4.show();

        // 有标题栏，没有最大化和最小化按钮
        Stage s5 = new Stage();
        s5.setTitle("S5");
        s5.initStyle(StageStyle.UTILITY);
        s5.show();

        // 关闭所有窗口，并退出程序
        Platform.exit();

    }
}
