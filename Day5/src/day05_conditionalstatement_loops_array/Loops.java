package day05_conditionalstatement_loops_array;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*for문
        Scanner scanDan = new Scanner(System.in);
        System.out.print("몇 단을 출력할까요? (예: 3)");
        int dan = scanDan.nextInt();
        for (int i = 1; i <= 9; ++i) {
            System.out.printf("%d X %d = %d\n",dan,i,i*dan);
        }
        */

        /*중첩 for문
        for (int i = 2; i <= 9; i++){
            System.out.printf("<%d단>\n",i);
            for (int j = 1; j <= 9; j++){
                System.out.printf("%d X %d = %d\n",i,j,i*j);
            }
        }
        */

        /*while문
        int i = 2;
        while (i <= 9){
            System.out.printf("<%d단>\n",i);
            int j = 1;
            while (j <= 9){
                System.out.printf("%d X %d = %d\n",i,j,i*j);
                j++;
            }
            i++;
        }
        */


        /*do while문
        int i = 1;
        do {
            System.out.printf("do-while 문 %d번째 실행\n",i);
            i++;
        }while(i < 1);
        System.out.printf("현재 i 변수의 값: %d",i);
        */

        //무한 반복
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        for (;;){ //or while (true)
            System.out.println("숫자를 무한으로 더하는 중입니다.");
            System.out.print("숫자를 입력하세요. -->");
            int input = scan.nextInt();
            if (input % 2 == 1){
                System.out.println("홀수 입니다. 짝수를 입력해 주세요.");
                continue;
            }
            sum += input;
            System.out.println("결과:" + sum);
            if (sum > 10000){
                break;
            }
        }
        System.out.println("반복문을 탈출했습니다.");
    }
}
