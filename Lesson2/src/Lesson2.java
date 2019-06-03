import javafx.application.Application;
import javafx.stage.Stage;

public class Lesson2 extends Application {

    @Override
    public void init() throws Exception {
        System.out.println("init() = " + Thread.currentThread().getName());
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop() = " + Thread.currentThread().getName());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        System.out.println("start() = " + Thread.currentThread().getName());
        primaryStage.show();
    }
}
