package Map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void initHashMap(){
//        HashMap<Integer,String> person = new HashMap<>();
        Map<Integer,String> Student = new HashMap<>();
        //insert element
        Student.put(01,"Hoang");
        Student.put(02,"Hoang1");
        Student.put(03,"Hoang2");
        Student.put(04,"Hoang3");
        System.out.println(Student);
        //ghi de
        Student.put(02,"hien");
        System.out.println(Student);
        //remove
        Student.remove(02);
        System.out.println(Student);
        //
        for (Map.Entry<Integer,String> entry:Student.entrySet()){
            Integer key = entry.getKey();
        }
    }

    public static void main(String[] args) {
        initHashMap();
    }
}
