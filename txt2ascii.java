import java.util.*;
import java.io.*;

public class txt2ascii{
    public static main(String[] args){
        File textFile = new File("text.txt");
        File ascii = new File("Ascii.txt");
        Scanner textScan = new Scanner(textFile);
        PrintStream asciiStream = new PrintStream(ascii);
        while(textFile.hasNextLine()){
            asciiStream.println("STRING " + textFile.nextLine());
            asciiStream.println("DELAY 200")
            asciiStream.println("ENTER");
            asciiStream.println("DELAY 100")
        }
    }
}