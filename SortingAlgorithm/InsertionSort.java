public class InsertionSort {
    public static void recusionInsertion(int []num, int i, int j){
        
        int current=num[i];
      
        if(j>=0 && current<num[j]){
            num[j+1]=num[j];
            recusionInsertion(num, i, j-1);
        }
    }
    public static void main(String[] args) {
        int []num={5,2,1,6,4};
        // for(int i=0;i<num.length;i++){
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

    }
}
