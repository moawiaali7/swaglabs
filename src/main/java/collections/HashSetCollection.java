package collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollection {
    //hash set can not accept duplicate value
    //hash set  takes random order
    public static void main(String[] args) {
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Moawia");
        hashSet.add("Osama");
        hashSet.add("Mazin");
       hashSet.add("Aboaudy");
        hashSet.add("Abdallah");
       hashSet.add("Muzamil");
       hashSet.add("Moawia");
        Iterator<String> iterator=hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());

        }
    }
}
