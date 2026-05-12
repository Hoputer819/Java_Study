package day01_input_output;

/*Day01 입출력*/

/*
public class day01_input_output.Main{
    public static void main(String[] args){
       System.out.print("Hello\n");
       System.out.println("Java");
    }
}
*/

/*
import java.io.IOException;

public class day01_input_output.Main{
    public static void main(String[] args) throws IOException {
        System.out.println((char)System.in.read());
    }
}
*/


import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println(scan.nextLine());
        System.out.println(scan.next());
        scan.close();
    }
}
