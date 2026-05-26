package class_practice;

public class SelfCheck {
    public static void main(String[] args){
        Person person = new Person("이승기",16);
        person.displayInfo();
        person.setName("이승호");
        person.setAge(18);
        System.out.println("수정한 이름: " + person.getName());
        System.out.println("수정한 나이: " + person.getAge());
    }
}
