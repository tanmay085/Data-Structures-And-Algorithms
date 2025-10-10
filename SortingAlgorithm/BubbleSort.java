import java.util.Arrays;

public class BubbleSort {

    public static void recursionBubble(int []num,int n, int j){
        if(n==1){
            return;
        }
        if(j==n-1){
            recursionBubble(num, n-1, 0);
            return;
        }
        
            if(num[j]>num[j+1]){
                int temp=num[j+1];
                num[j+1]=num[j];
                num[j]=temp;
            }
       
        recursionBubble(num, n, j+1);
    }

    public static void main(String[] args) {
        int []num={2,1,4,3};
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num.length-i-1;j++){
                if(num[j]>num[j+1]){
                    int temp=num[j+1];
                    num[j+1]=num[j];
                    num[j]=temp;
                }
            }
        }
        for(int i=0;i<num.length;i++){
            System.out.print(num[i]);
        }
       
        recursionBubble(num, num.length, 0);
        System.out.print(Arrays.toString(num));
       
    }


}
