
import java.util.*;

public class HashingHashSet {
    public static void main(String[] args) {
        HashSet <Integer> set=new HashSet<>();
        
        //Insert
        set.add(1);
        set.add(3);
        set.add(4);
        set.add(7);
        set.add(8);

        //Search
        if(set.contains(3)){
            System.out.println("present");
        }

        //Remove
        set.remove(2);

        //Size
        System.out.println(set.size());
        
        //Iterate through hashset

        Iterator it= set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        System.out.print(set);
    }
}
