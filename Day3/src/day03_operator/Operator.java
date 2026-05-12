package day03_operator;

import java.util.Scanner;

public class Operator {
    public static void main(String[] args){

        //값 입력 및 연산
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int add = a+b;
        int sub = a-b;
        int mul = a*b;
        int div = a/b;
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);

        //문자 연산
        System.out.println("123"+4);
        System.out.println("123"+"456");
        System.out.println("abcd"+"efgh");
        System.out.println("코딩"+"자율학습");

        int age = 18;
        System.out.println("나는 올해"+age+"살입니다.");
    }
}
