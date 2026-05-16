import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
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
    }
}