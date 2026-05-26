package day06_class.ch07;

public class Main{
    public static void main(String[] args){
        Car car = new Car();
        System.out.println("");
        Car myCar = new Car("Hyundai",2025);
        System.out.println("");
        Car yourCar = new Car("kia",2025,"Black");
        yourCar.carInfo();
        System.out.println("");
        Car.countOfCarsInfo();
    }
}
