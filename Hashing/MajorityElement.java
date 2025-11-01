import java.util.*;
public class MajorityElement {
    public static void main(String[] args) {
        int []arr={1,2,1,3,1,2,3,1};
        int target=arr.length/3;
        int count=0;
        HashMap <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
            }else{
                map.put(arr[i], 1);
            }
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()>target){
                System.out.print(e);
            }
        }



    }
    
}
