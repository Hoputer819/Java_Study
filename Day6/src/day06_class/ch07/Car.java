package day06_class.ch07;

public class Car { //클래스 선언
    
    static int countOfCars = 0; //클래스 변수 선언
    
    String brand; //인스턴스 변수
    int year; //인스턴스 변수
    String color; //인스턴스 변수

    public Car(){ //생성자
        System.out.println("새로운 자동차 객체가 생성됐습니다.");
        this.carInfo();
        countOfCars++;
        countOfCarsInfo();;
    }

    public Car(String brand, int year){ //생성자
        System.out.println("새로운 자동차 객체가 생성됐습니다.");
        this.brand = brand;
        this.year = year;
        this.color = "white";
        this.carInfo();
        countOfCars++;
        countOfCarsInfo();;
    }
    public Car(String brand, int year,String color){ //생성자
        System.out.println("새로운 자동차 객체가 생성됐습니다.");
        this.brand = brand;
        this.year = year;
        this.color = color;
        countOfCars++;
        countOfCarsInfo();;

    }
    
    public void carInfo(){ // 인스턴스 메서드
        System.out.println("--- 자동차 정보 ---");
        System.out.println("브랜드: "+brand);
        System.out.println("연식: "+year);
        System.out.println("색: "+color);
    }
    public static void countOfCarsInfo() { //정적 메서드
        System.out.println("자동차 수량: "+countOfCars);
    }
}
