package inne;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class UkladWidokuu extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        //Layout

        // BorderPane
        BorderPane borderPane = new BorderPane();
        TextField textFieldGora = new TextField("gora");
        borderPane.setTop(textFieldGora);
        TextField textFieldDol = new TextField("dol");
        borderPane.setBottom(textFieldDol);
        TextField textFieldSrodek = new TextField("Srodek");
        borderPane.setCenter(textFieldSrodek);
        TextField textFieldLewy = new TextField("lewy");
        borderPane.setLeft(textFieldLewy);
        TextField textFieldPrawy = new TextField("Prawy");
        borderPane.setRight(textFieldPrawy);

        Scene scene = new Scene(borderPane, 800,600);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Uklad elementow w widoku");
        primaryStage.show();

    }
}
