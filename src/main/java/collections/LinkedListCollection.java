package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListCollection {
    //linked list accept duplicate value
    // linked list more organize then arraylist
    public static void main(String[] args) {
        LinkedList<String>list=new LinkedList<String>();
        list.add("Moawia");
        list.add("Osama");
        list.add("Mazin");
        list.add("Aboaudy");
        list.add("Abdallah");
        list.add("Muzamil");
        list.add("Moawia");

        Iterator<String> iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
