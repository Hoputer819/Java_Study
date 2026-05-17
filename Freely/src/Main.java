import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /* 정수 입력 받아서 저하고 빼고 곱하고 나누기
        Scanner scan = new Scanner(System.in);

        System.out.print("정수를 입력하세요. --> ");
        int a = scan.nextInt();
        System.out.print("실수를 입력하세요. --> ");
        double b = scan.nextDouble();
        System.out.printf("덧셈 결과(정수): %d\n",a+(int)b);
        System.out.printf("뺄셈 결과(실수): %.1f\n",a-b);
        System.out.printf("곱셈 결과(실수): %.1f\n",a*b);
        System.out.printf("나눗셈 결과(정수): %d",a/(int)b);
        */

        /* a,b,c 소문대 대문자로 바꾸기
        Scanner scan = new Scanner(System.in);
        System.out.println("알파벳읋 입력하세요.");
        String alp = scan.nextLine();
        switch (alp){
            case("a"):
                System.out.println("A");
                break;
            case("b"):
                System.out.println("B");
                break;
            case("c"):
                System.out.println("C");
                break;
            default:
                System.out.println("일치하는 알파벳이 없습니다.");
        }
        scan.close;
        */

        //자판기 프로그램(switch로 하는게 더 편함)
        Scanner num = new Scanner(System.in);
        Scanner mon = new Scanner(System.in);
        System.out.println("**** 자판기 프로그램을 시작합니다.");
        int money = 0;
        while (true){
            System.out.printf("현재 투입된 금액: %d원\n1. 콜라(1500원)\n2. 오렌지주스(2000원)\n3. 생수(1000원)\n4. 종료\n음료를 고르세요. (번호 입력):",money);
            int number = num.nextInt();
            if (number == 1){
                if (money >= 1500){
                    money -= 1500;
                }else{
                    System.out.print("금액이 부족합니다. 돈을 더 투입하세요.");
                    int plus = mon.nextInt();
                    money += plus;
                }
            }else if (number == 2){
                if (money >= 2000){
                    money -= 2000;
                }else{
                    System.out.print("금액이 부족합니다. 돈을 더 투입하세요.");
                    int plus = mon.nextInt();
                    money += plus;
                }
            }else if (number == 3){
                if (money >= 1000){
                    money -= 1000;
                }else{
                    System.out.print("금액이 부족합니다. 돈을 더 투입하세요.");
                    int plus = mon.nextInt();
                    money += plus;
                }
            }else if (number == 4){
                break;
                return;
            }else{
                System.out.println("다시 선택하세요.");
            }

        }

    }
}