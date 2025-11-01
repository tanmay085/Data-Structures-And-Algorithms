import java.util.*;
public class HashingHashMap{
    public static void main(String[]args){
        HashMap<Integer, String>map=new HashMap<>();
        //add value.
        map.put(1,"tanmay" );
        map.put(2, "thomdya");

        //Check value is present or not.
        if(map.containsKey(1)){
            System.out.println("present");
        }

        //Remove element in map
        map.remove(1);
        
        //print value using key
        System.out.println(map.get(1));

        //Interate through map to print entire map
        for(Map.Entry<Integer,String>e:map.entrySet()){
            System.out.println(e.getKey()+" "+e.getValue());
            System.out.println(e);
        }


        Set<Integer> keys=map.keySet();
        for(int key:keys){
            System.out.println(key);
        }
        
    }
}