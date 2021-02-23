package Lesson8;

import net.bytebuddy.agent.builder.AgentBuilder;

import java.sql.SQLOutput;
import java.util.*;

public class CollectionExample {
    public static void main(String[] args){
        int []arr = new int [10];
        String [] strings = new String[10];

        for (String string : strings){

           // System.out.println(string.charAt(0)+" "); //null.charAt(1) = NullPOinterException
            System.out.println(string+ " ");
        }
        for (int i:arr){
            System.out.println(i+" ");
        }
        //==========Collections==========
        //List - списки
        List<Integer> linkedList = new LinkedList<>();

        linkedList.add(12);
        linkedList.add(13);
        linkedList.add(21); //метод который добавляет элемент
        linkedList.remove(0); //метод который удаляет элемент
       // linkedList.add(0,100);


        for (Integer integer : linkedList) { //iter - вызов фор ич
            System.out.println("Linked "+integer);
        }

        List<String> arrayList = new ArrayList<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        arrayList.remove("three");
        arrayList.remove(0);

        for (String s : arrayList) { //iter - вызов фор ич
            System.out.println("arrayList "+s);
        }

        Set<String>set = new HashSet<>();//хранит уникальные значения, не обещает упорядоченности

        set.add("A");
        set.add("A");
        set.add("Z");
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("C");
        set.add("C");

        for (String s : set) {
            System.out.println("Set = "+s);
        }

        Iterator<?>iterator = set.iterator();
        while (iterator.hasNext()){
            String next = (String) iterator.next();
            System.out.println();
        }

        System.out.println("A".hashCode());
        System.out.println("B".hashCode());
        int a = 12;
        System.out.println(Integer.hashCode(a));
        Integer b = 13;
        System.out.println(b.hashCode());

        Set<Student>students = new HashSet<>();
        students.add(new Student("Test1", "12345"));
        students.add(new Student("Test2", "12346"));
        students.add(new Student("Test2", "12346"));
        students.add(new Student("Test4", "12348"));

        for (Student student : students) {
            System.out.println("student = "+student);
        }
    }
}
