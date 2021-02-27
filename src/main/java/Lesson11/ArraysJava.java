package Lesson11;

import java.util.*;

public class ArraysJava {
    public static void main(String[] args){
        String[] str = {"6","9","1"};
                List<String> strings = new ArrayList<>(List.of(str));
     List<String> str1 = Arrays.asList(str);
     strings.sort(String::compareTo);

     for (String s:strings){
         System.out.println(s);
     }

     Map<String,Integer> phoneBook = new HashMap<>();
     phoneBook.put("Marina", 997657584);
     phoneBook.put("Sasha", 997657898);


     for (String contacts : phoneBook.keySet()){
         System.out.println(contacts);
     }
        for (Integer value : phoneBook.values()){
            System.out.println(value);
        }
        for (Map.Entry<String,Integer> entry : phoneBook.entrySet()){//объект типа энтри
            System.out.println(entry.getKey()+" + "+entry.getValue());
        }
    }
}
