package inne;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AplikacjaGraficzna extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Stage -> Scene StackPane -> Text

        //Controls nody-wezly
        Text text = new Text("Tekst z pierwszej aplikacji graficznej");
        Button button = new Button("Moj pierwszy przycisk");
        Text textDrugi = new Text ("Text drugi");

        //root
        // StackPane root = new StackPane();
        //HBox root = new HBox();
        VBox root = new VBox();
        root.getChildren().add(text);
        root.getChildren().add(button);
        root.getChildren().add(textDrugi);
        // scene
        Scene scene = new Scene(root);
        // stage
        primaryStage.setScene(scene);

        primaryStage.setTitle("Moja aplikacja");

        primaryStage.setX(300);
        primaryStage.setY(200);

        primaryStage.setWidth(800);
        primaryStage.setHeight(600);

        //primaryStage.initStyle(StageStyle.DECORATED);
        //primaryStage.initStyle(StageStyle.UNDECORATED);
        //primaryStage.initStyle(StageStyle.UTILITY);
        //primaryStage.initStyle(StageStyle.TRANSPARENT);
        //primaryStage.initStyle(StageStyle.UNIFIED);
        //primaryStage.setFullScreen(true); //for me xD

        primaryStage.setFullScreen(false);



        primaryStage.show();

    }
}
