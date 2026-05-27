package day08_inheritance.ch08;

public class Cat extends Animal {
    public Cat(String name, int age){
        super(name, age);
    }
    public void rub(){
        System.out.println(name + "가 몸을 비빕니다.");
    }
    public void eat(){
        super.eat();
        System.out.println(name + "가 닭고기를 먹습니다.");
    }
}
