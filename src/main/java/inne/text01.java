package inne;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class text01 {

    public static void main(String[] args) {
        try {
            File myObj = new File("C:\\xxxCANTOR\\KURSY.CSV");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine(); //odczytuje tekst
                System.out.println(data); //wyswietlam text
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}