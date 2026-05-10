package day02_variable_datatype;

public class DataType {
    public static void main(String[] args){

        //변수 자료형
        byte a = 1;
        short b = 2;
        int c = 4;
        long d = 8L;
        float e = 4f;
        double f = 8;
        char g = '2';
        boolean h = true;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        //문자열(참조 자료형)
        String i = "문자열";
        System.out.println(i);

        //서식 지정자
        System.out.printf("이름: %s%n나이: %d%n취미: %s%n","이승호",18,"코딩");

        //서식 지정자 플래그
        System.out.printf("%7d%n",11111);
        System.out.printf("%-7d%n",11111);
        System.out.printf("%07d%n",11111);
        System.out.printf("%,7d%n",11111);

        //실수형 서식 지정자 소수점
        System.out.printf("%.4f",3.14);
    }
}
