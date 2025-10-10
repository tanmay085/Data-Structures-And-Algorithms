public class SelectionSort {
   
   public static void main(String[] args) {
       int []num={2,3,1,4};
       for(int i=0;i<num.length;i++){
        int small=i;
        for(int j=i+1;j<num.length;j++){
            if(num[j]<num[small]){
                small=j;
            }
        }
        int temp=num[small];
        num[small]=num[i];
        num[i]=temp;
       }
       for(int i=0; i<num.length;i++){
        System.out.print(num[i]);
       }
   }
    
}
