
import java.util.HashSet;
import java.util.Iterator;

public class UnionTwoArray {
    public static void main(String[]args){
        int []arr1={1,2,4,3};
        int []arr2={2,3,7,8};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0 ;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        for(int i=0 ;i<arr2.length;i++){
            set.add(arr2[i]);
        }

        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.print(it.next());
        }
        
    }
    
}
