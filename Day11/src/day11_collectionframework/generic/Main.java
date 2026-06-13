package day11_collectionframework.generic;

public class Main {
    public static void main(String[] args){
        Box<String> box = new Box<>();
        box.setContent("Hello, World!");
        String content = box.getContent();
        System.out.println(content);
    }
}
