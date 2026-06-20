package day13_inputoutputstream;

import java.io.*;

public class SelfCheck {
    public static void main(String[] args){
        try(BufferedReader read = new BufferedReader(new FileReader("D:/java/inputTest.txt"));
            BufferedWriter write = new BufferedWriter(new FileWriter("D:/java/outputTest.txt",true))){
            String name = read.readLine();
            write.newLine();
            write.write(name);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
