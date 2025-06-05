package xyz;
import java.util.*;  

class ArrayListExamples {  
    public ArrayListExamples() {  
        ArrayList<String> students = new ArrayList<>();  
        students.add("vishnu");  
        students.add("mohan");  
        students.add("venkatesh");  
        students.add("basireddy");  
        students.add("vishnu");  
        System.out.println("List of Students (ArrayList): " + students);  
    }  
}  

class Reddy extends ArrayListExamples {  
    public Reddy() {  
        LinkedList<String> linkedlist = new LinkedList<>();  
        linkedlist.add("vishnu");  
        linkedlist.add("mohan");  
        linkedlist.add("venkatesh");  
        linkedlist.add("basireddy");  
        linkedlist.add("vishnu");  
        System.out.println("List of Students (LinkedList): " + linkedlist);  
    }  
}  

class Maxii extends ArrayListExamples {  
    public Maxii() {  
        HashMap<Integer, String> hashmap = new HashMap<>();  
        hashmap.put(1, "vishnu");  
        hashmap.put(2, "mohan");  
        hashmap.put(3, "venkatesh");  
        hashmap.put(4, "basireddy");  
        hashmap.put(5, "vishnu");  
        System.out.println("List of Students (HashMap): " + hashmap);  
    }  
}  

public class AllLists {  
    public static void main(String[] args) {  
        new ArrayListExample();  
        new Reddy();  
        new Maxii();  
    }  
}
