import java.util.*;
import java.io.*;

public class Txt2ascii{
    public static void main(String[] args)throws FileNotFoundException{
        File textFile = new File("text.txt");
        File ascii = new File("ascii.txt");
        Scanner textScan = new Scanner(textFile);
        PrintStream asciiStream = new PrintStream(ascii);
        while(textScan.hasNextLine()){
            String line = textScan.nextLine();
            asciiStream.println("STRING " + line);
            asciiStream.println("DELAY 200");
            asciiStream.println("ENTER");
            asciiStream.println("DELAY 100");
        }
    }
}