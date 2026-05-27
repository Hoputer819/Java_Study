package day08_inheritance.ch08;

public class AnimalMain {
    public static void main(String[] args){
        Dog myDog = new Dog("바둑이",3,"진돗개");
        Cat myCat = new Cat("나비",2);
        myDog.eat();
        myDog.roll(2);
        myCat.eat();
        myCat.rub();
    }
}
