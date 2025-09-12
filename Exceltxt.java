import java.util.*;
import java.io.*;

public class Exceltxt{
    public static void main(String[] args)throws FileNotFoundException{
        File original = new File("original.txt");
        Scanner fileScan = new Scanner(original);
        File output = new File("output.txt");
        boolean freshline = true;
        PrintStream printOutput = new PrintStream(output);
        while(fileScan.hasNextLine()){
            String nextLine = fileScan.nextLine();
            if(nextLine.contains("(Missed)")){
                printOutput.print(nextLine + "-");
            }else if(nextLine.equals("")){
                printOutput.println();
            }
        }
    }
}