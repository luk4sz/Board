import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javafx.fxml.FXMLLoader;



public class Tablica extends Application {

    Text text = new Text("Jakiś tekst");

    public static void main(String[] args) {
        launch(args);
    }
    //Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

    @Override
    public void start(Stage primaryStage) {
        //poczatek
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                //co ma sie robic w watku
                String line = "";
                String splitBy = ",";
                String podajWalute = "EUR";
                String textZPliku="test2";
                try {
                    for (int i = 1; i < 10; i--) { //petla nieskonczona poczatek
                        try {
                            Thread.sleep(2000);
                        } catch (InterruptedException e) {
                        }
                        //parsing a CSV file into BufferedReader class constructor
                        BufferedReader br = new BufferedReader(new FileReader("C:\\TEST\\KURSY.CSV"));
                        while ((line = br.readLine()) != null)   //returns a Boolean value
                        {
                            String[] waluta = line.split(splitBy);    // use comma as

                            if (waluta[0].equals(podajWalute)) {
                                textZPliku= "waluta=" + waluta[0] + ", Kupno=" + waluta[1] + ", Sprzedaz=" + waluta[2];
                               //textZPliku=waluta[1];
                                //System.out.println("Watek1 :" +textZPliku+ i);
                                text.setText(textZPliku);
                            }
                        }
                    } // koniec petli for

                } catch (IOException e) {
                    e.printStackTrace();
                }
                //return wynik;
                // koniec co ma sie robic
            }
        });
        thread3.start();
        //koniec watku pierwszeo
/*        //poczatek watku 2 testowego
        Thread thread4 = new Thread(new Runnable() {
            @Override
            public void run() {
                //Tablica.main(args);
                //takie tam inne
                for (int i = 0; i < 10; i++) {
                    System.out.println("Watek2 :" + i);
                    try {
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                    }
                }
            }
        }); //koniec watku drugiego
        thread4.start();
        //koniec watku 2*/
        //xxxxxxxxxxxx koniec watkow

        Text texxt = new Text("Tekst z pierwszej aplikacji graficznej");


        VBox root = new VBox();
        root.getChildren().add(texxt);
        root.getChildren().add(text);
        // scene
        Scene scene = new Scene(root);
        // stage
        primaryStage.setScene(scene);

        primaryStage.setTitle("Moja Pierwsza Aplikacja");

        primaryStage.setX(300);
        primaryStage.setY(200);
        primaryStage.setWidth(1920);
        primaryStage.setHeight(1080);
        primaryStage.setFullScreen(false);
        primaryStage.show();
    }
}