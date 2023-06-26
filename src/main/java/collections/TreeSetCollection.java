package collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetCollection {
    //tree set takes by order and can not accept duplicate value
    public static void main(String[] args) {
        TreeSet<String> treeSet=new TreeSet<>();
      treeSet.add("Moawia");
       treeSet.add("Osama");
        treeSet.add("Mazin");
        treeSet.add("Aboaudy");
        treeSet.add("Abdallah");
       treeSet.add("Muzamil");
        treeSet.add("Moawia");
        Iterator<String> iterator=treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
