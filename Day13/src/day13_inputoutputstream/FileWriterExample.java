package day13_inputoutputstream;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("D:/java/output.txt",true))){

            writer.newLine();
            writer.write("Hello, Java!");
            writer.newLine();
            writer.write("This is another line.");
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }
}
