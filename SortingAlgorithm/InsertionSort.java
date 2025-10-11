import  java.util.*;
public class InsertionSort {
    public static void recusionInsertion(int []num, int i=1){
       
        if(i==num.length){
            return;
        }
        
        int current =num[i]; 
        int j=i-1;
        while(j>=0 && current <num[j]){
            num[j+1]=num[j];
            j--;
        }
        
        num[j+1]=current;
        recusionInsertion(num, i+1);
        
       

    }
    public static void main(String[] args) {
        int []num={5,2,1,6,4};
        // for(int i=1;i<num.length;i++){
        //     int current=num[i];
        //     int j=i-1;
        //     while(j>=0 && current<num[j]){
        //         num[j+1]=num[j];
        //         j--;
        //     }
        //     num[j+1]=current;
        // }
        // for(int i=0;i<num.length;i++){
        //     System.out.println(num[i]);
        // }
        recusionInsertion(num, 1);
        System.out.print(Arrays.toString(num));

    }
}
