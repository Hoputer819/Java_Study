package day12_collection;

import java.util.Collection;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;




public class School {
    public static void main(String[] args){
        ArrayList<String> name = new ArrayList<>();
        name.add("홍길동");
        name.add("김길벗");
        name.add("이코천");
        name.add("홍길동");
        System.out.println(name);
        HashSet<String> name2 = new HashSet<>(name);
        name2.add("강남순");
        System.out.println(name2);
        HashMap<String,String> score = new HashMap<>();
        score.put("홍길동","85점");
        score.put("김길벗","92점");
        score.put("이코천","78점");
        score.put("강남순","90점");
        for (String i : score.keySet())
            System.out.println("이름: " + i + " 점수: " + score.get(i));
        if (score.containsKey("홍길동"))
            System.out.println(score.get("홍길동"));
    }
}
