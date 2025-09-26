// package SortingAlgorithm;
public class SelectionSort {
    public static void slection(int []arr){
        int size=arr.length;
        for(int i=0;i<size;i++){
            int small=i;
            for(int j=i+1;j<size;j++){
                if(arr[small]>arr[j])
                small=j;
            }
            int temp=arr[i];
            arr[i]=arr[small];
            arr[small]=temp;
        }
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String []args){
        int []number={4,1,6,2,7};
        SelectionSort selectionSort=new SelectionSort();
        selectionSort.slection(number);


    }
    
}
