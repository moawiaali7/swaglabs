package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHasSetCollection {
    //lined hash set takes by order
    public static void main(String[] args) {
        LinkedHashSet<String> linkedHashSet= new LinkedHashSet<>();
       linkedHashSet.add("Moawia");
        linkedHashSet.add("Osama");
        linkedHashSet.add("Mazin");
       linkedHashSet.add("Aboaudy");
       linkedHashSet.add("Abdallah");
      linkedHashSet.add("Muzamil");
       linkedHashSet.add("Moawia");
        Iterator<String> iterator=linkedHashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
