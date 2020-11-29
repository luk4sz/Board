package inne;

import java.io.*;
import java.util.Scanner;

public class text02 {

    public static void main(String[] args)
    {
        String line = "";
        String splitBy = ",";
        try
        {
//parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("C:\\xxxCANTOR\\KURSY.CSV"));
            while ((line = br.readLine()) != null)   //returns a Boolean value
            {
                String[] waluta = line.split(splitBy);    // use comma as separator
                System.out.println("Waluty: [Nazwa waluty=" + waluta[0] + ", Kupno=" + waluta[1] + ", Sprzedaz=" + waluta[2] + ", Data=" + waluta[3] + ", Godzina= " + waluta[4] + "]");
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

