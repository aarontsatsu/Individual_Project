package individualProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Aaron Tsatsu Tamakloe
 * The Main class represents the execution object.
 */
public class Main {

    /**
     * main method is used to integrate the various classes and execute the program to find solutions
     * @param args
     * @throws FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException {
        String sourceCity= "";
        String sourceCountry = "";
        String destCity = "";
        String destCountry = "";

        //read input from input file
        BufferedReader inputRead = new BufferedReader(new FileReader("accra-winnipeg.txt"));
        List<String> readInfo = new ArrayList<String>();
        try
        {
            for (int i = 0; i < 2; i++)
            {
                readInfo.add(inputRead.readLine());
            }
            String[] data1 = readInfo.get(0).split(",");
            String[] data2 = readInfo.get(1).split(",");
            sourceCity = data1[0];
            sourceCountry = data1[1];
            destCity = data2[0];
            destCountry = data2[1];

            System.out.println(sourceCity);
            inputRead.close();
        }
         catch(IOException io)
        {
            System.out.println("IOException thrown.");
        }


        //pass source city as parameter into the graph search

        //write results into new file.
    }
}
