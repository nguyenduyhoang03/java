package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
        Students Student1 = new Students(32,"Hoang","Hoang@gmial.com","0979u89221");
        Students Student2 = new Students(321,"Hoang","Hoang@gmial.com","0979u89221");
        Students Student3 = new Students(312,"Hoang","Hoang@gmial.com","0979u89221");
        Students Student4 = new Students(123,"Hoang","Hoang@gmial.com","0979u89221");
        //
        Map<Integer,Students> map = new HashMap<>();
        //map.put(01,"hoang");
        map.put(Student1.getId(),Student1);
        map.put(Student2.getId(),Student2);
        map.put(Student3.getId(),Student3);
        map.put(Student4.getId(),Student4);

        // show map key.Set
        for(Integer key : map.keySet()){
            Students value = map.get(key);
            System.out.println(key + "x" + value);
        }
        // entryset
        for (Map.Entry<Integer,Students> entry: map.entrySet()){
            Integer key = entry.getKey();
            Students value = entry.getValue();
            System.out.println(key + "=" + value.getName());
        }
        //treeMap
        TreeMap<String,Integer> subject = new TreeMap<>();
        subject.put("C++",3);
        subject.put("Java",4);
        subject.put("Python",9);
        subject.put("C#",8);
        subject.put("Kotlin",6);
        System.out.println(subject);

        //linkedHashMap
        Map<String,Double> linkHashMap = new LinkedHashMap<>();
        linkHashMap.put("FPT",123.5);
        linkHashMap.put("VNG",123.6);
        linkHashMap.put("Garena",122.5);
        System.out.println("linkedHashMap: " + linkHashMap);
        System.out.println("Entryset: " + linkHashMap);

    }
}
