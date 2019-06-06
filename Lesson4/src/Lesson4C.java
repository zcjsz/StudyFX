import javafx.application.Application;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Lesson4C extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        // S2设置为 Application 模态窗口，S1和S2同时出现的时候必须要先关闭S2后才能操作S1
        /*
        Stage s1 = new Stage();
        s1.setTitle("S1");
        s1.initModality(Modality.NONE);

        Stage s2 = new Stage();
        s2.setTitle("S2");
        s2.initOwner(s1);
        s2.initModality(Modality.APPLICATION_MODAL);

        s1.show();
        s2.show();
        */

        // S4设置为 Window 模态窗口，S4关联了S3，S3和S4同时出现的时候必须要先关闭S4后才能操作S3

        Stage s3 = new Stage();
        s3.setTitle("S3");
        s3.show();

        Stage s4 = new Stage();
        s4.setTitle("S4");
        s4.initOwner(s3);
        s4.initModality(Modality.WINDOW_MODAL);
        s4.show();


    }
}
