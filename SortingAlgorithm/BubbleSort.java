package SortingAlgorithm;
import java.util.Scanner;

public class BubbleSort {
    public int[] bubble(int[]arr){
        int size=arr.length;
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
        
    }
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int s=sc.nextInt();
        int [] number=new int[s];
        for(int i=0;i<number.length;i++){
            number[i]=sc.nextInt();
        }
        
        BubbleSort bubbleSort=new BubbleSort();
        int [] sorted=bubbleSort.bubble(number);
        for(int i=0;i<sorted.length;i++){
            System.out.print(sorted[i]);
        }
    }
}
