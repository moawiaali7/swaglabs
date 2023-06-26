package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListCollection {
    //array list can accept duplicate value
    public static void main(String[] args) {
        ArrayList<String> list= new ArrayList<String>();
        list.add("Moawia");
        list.add("Osama");
        list.add("Mazin");
        list.add("Aboaudy");
        list.add("Abdallah");
        list.add("Muzamil");
        list.add("Moawia");

        Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
