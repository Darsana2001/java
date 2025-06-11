
Import java.io.*;
Import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("good");
        list.add("evening");
        list.add("Have");
        list.add("a");
        list.add("good");
        list.add("day");
        
        System.out.println("Original linked list: " + list);
        list.clear();
        
        System.out.println("List after removing elements: " + list);
        list.add("looks");
        list.add("good");
        System.out.println("After adding elements to empty list: " + list);
    }
}