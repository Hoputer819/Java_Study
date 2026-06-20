package day13_inputoutputstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class FileReaderExample {
    public static void main(String[] args){
        try (BufferedReader br = new BufferedReader(new FileReader("D:/java/input.txt"))){
            String line;
            while((line = br.readLine()) != null){
                System.out.print(line);
            }
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }
}
