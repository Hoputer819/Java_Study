package day13_inputoutputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {
    public static void main(String[] args){
        String data = "Hello, World!";
        try{
            FileOutputStream fos = new FileOutputStream("D:/java/output.txt");
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Writing completed.");
        }

        catch (IOException e){
            e.printStackTrace();
        }
    }
}
