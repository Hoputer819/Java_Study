package day12_collection;

import java.util.LinkedList;

public class LinkedLIstExample {
    public static void main(String[] args){
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("Apple");
        list.addLast("Banana");
        list.push("Cherry");
        System.out.println("리스트 상태: " + list);
        System.out.println("첫 번째 요소: " + list.getFirst());
        list.pop();
        System.out.println("리스트 상태: " + list);
        list.removeLast();
        System.out.println("리스트 상태: " + list);
        list.addLast("Durian");
        System.out.println("리스트 상태: " + list);
        list.pop();
        System.out.println("리스트 상태: " + list);
        System.out.println("첫 번째 요소: " + list.getFirst());
        System.out.println("최종 리스트: " + list);
    }
}
