package day04_shapeconversion;

public class ShapeConversion {
    public static void main(String[] args){

        //형변환
        int a = 100;
        int b = 3;
        double div = (double)a / (double)b;
        System.out.println(div);

        //명시적 형변환
        int num1 = 12;
        float num2 =12.3F;
        int result1 = num1 + (int)num2;
        System.out.println(result1);

        //묵시적 형변환
        int num3 = 12;
        float num4 = 12.3F;
        float result2 = num3 + num4;
        System.out.println(result2);
    }
}
