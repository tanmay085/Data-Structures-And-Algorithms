import java.util.*;
public class ItenereryCity {
    public static void main (String[]args){
        HashMap<String, String>map=new HashMap<>();
        map.put("Chennai", "benglaru");
        map.put("Mumbai", "delhi");
        map.put("delhi", "goa");
        map.put("goa", "Chennai");
        String start="";

        HashMap<String, String> revMap=new HashMap<>();
        for(String Key:map.keySet()){
            revMap.put(map.get(Key), Key);
        }

        for(String e:map.keySet()){
            if(revMap.containsKey(e)==false){
                start=e;
            }
        }
        while(map.containsKey(start)){
            System.out.println(start);
            start=map.get(start);
        }
        System.out.print(start);
    }
    
}
