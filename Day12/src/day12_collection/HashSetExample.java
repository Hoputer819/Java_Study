package day12_collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args){
        HashSet<String> fruits = new HashSet<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("cherry");
        System.out.println("집합 상태: " + fruits);
        fruits.add("Apple");
        System.out.println("집합 크기: " + fruits.size());
        System.out.println("Banana가 있는가? " + fruits.contains("Banana"));
        System.out.println("Banana가 삭제됐는가? " + fruits.remove("Banana"));
        System.out.println("Banana가 있는가? " + fruits.contains("Banana"));
        System.out.println("집합이 비어 있는가?" + fruits.isEmpty());
        System.out.println("집합 요소: ");
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        fruits.clear();
        System.out.println("최종 집합 크기: " + fruits.size());
        System.out.println("집합이 비어 있는가? " + fruits.isEmpty());
    }
}
