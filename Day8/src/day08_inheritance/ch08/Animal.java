package day08_inheritance.ch08;

public class Animal {
    String name;
    int age;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println("이름: " + this.name + "\n나이: " + this.age);
    }

    public void eat(){
        System.out.println(name + "가 밥을 먹습니다.");
    }
}
