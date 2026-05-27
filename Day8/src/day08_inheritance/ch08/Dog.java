package day08_inheritance.ch08;

public class Dog extends Animal {
    String breed;;
    public Dog(String name, int age, String breed){
        super(name, age);
        this.breed = breed;
        System.out.println("품종: " + this.breed);
    }
    public void roll(){
        System.out.println(name + "가 바닥을 구릅니다.");
    }
    public void roll(int times){
        System.out.println(name + "가 바닥을 " + times + "번 구릅니다.");
    }
}
