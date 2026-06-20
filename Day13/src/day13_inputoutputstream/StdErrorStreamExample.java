package day13_inputoutputstream;

public class StdErrorStreamExample {
    public static void main(String[] args){
        try{
            int result = 10/0;
        }

        catch (ArithmeticException e){
            System.err.println("Error: Division by zero!");
        }

        System.out.println("프로그램 실행 중");
    }
}
