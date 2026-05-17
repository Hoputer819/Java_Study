package day05_conditionalstatement_loops_array;

import java.util.Scanner;

public class ConditionalStatement {
    public static void main(String[] args) {

        /*조건문(if,else if,elif)
        int score = 89;
        if (score >= 90) {
            System.out.println("A학점입니다.");
        } else if (score >= 80){
            System.out.println("B학점입니다.");
        } else if (score >= 70){
            System.out.println("C학점입니다.");
        }else{
            System.out.println("D학점입니다.");
        }
        */

        /* 중첩 조건문
        Scanner scanGrade = new Scanner(System.in);
        System.out.println("학년을 입력하세요.");
        int Grade = scanGrade.nextInt();
        if (Grade == 4){
            Scanner scanScore = new Scanner(System.in);
            System.out.println("점수를 입력하세요.");
            int Score = scanScore.nextInt();
            if(Score >= 90){
                System.out.println("장학금 지급 대상입니다.");
            }else{
                System.out.println("장학금 지급 대상이 아닙니다.");
            }
        }else{
           System.out.println("장학금 지급 대상자가 아닙니다.");
           scan.close()
        }
        */

        /* switch문
        Scanner scan = new Scanner(System.in);
        System.out.println("점수를 입력해주세요.");
        int score = scan.nextInt();
        switch (score){
            case(90):
                System.out.println("A학점입니다.");
                break;
            case(80):
                System.out.println("B학점입니다.");
                break;
            case(70):
                System.out.println("C학점입니다.");
                break;
            default:
                System.out.println("D학점입니다.");
        scan.close;
        }
        */

        // 삼항 연산자
        System.out.println("점수를 입력하세요. (예: 95,90,85,80)");
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        String grade = (input >= 90) ? "A" : "B";
        System.out.println(grade + "학점입니다.");

        scan.close();

    }
}