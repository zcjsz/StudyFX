import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

import java.util.Timer;
import java.util.TimerTask;

public class Lesson5A extends Application {

    private static Timer timer = new Timer();
    private static boolean flag = true;

    public static void main(String[] args) {

        System.out.println("In main method ... " + Thread.currentThread().getName());

        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("In timer task, Time's Up! ... " + Thread.currentThread().getName());
                flag = false;
            }
        },2000);
        launch(args);
        timer.cancel();

    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        System.out.println("In start method, before runLater ... " + Thread.currentThread().getName());

        Stage s1 = new Stage();
        s1.setTitle("S1");
        s1.show();
        s1.setX(100);
        s1.setY(100);

        Stage s2 = new Stage();
        s2.setTitle("S2");
        s2.show();
        s2.setX(200);
        s2.setY(200);

        // runLater线程，另一个 javafx applicaiton 线程
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                while(flag) {
                    try { Thread.sleep(500); } catch (InterruptedException e) { e.printStackTrace(); }
                    System.out.println("In runLater, window is showing ... " + Thread.currentThread().getName());
                }
                s1.close();
                s2.close();
                System.out.println("In runLater, window is closed  ... " + Thread.currentThread().getName());
            }
        });

        System.out.println("In start method, after  runLater ... " + Thread.currentThread().getName());

    }
}
