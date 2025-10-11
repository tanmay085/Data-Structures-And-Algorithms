public class QuickSort {
    public static  int partition(int[]arr, int low, int high){
        int pivate =arr[high];
        int i=low-1;
        for(int j=low; j<high;j++){
            if(pivate>arr[j]){
                i++;

                int temp= arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
        i++;
        int temp=arr[i];
        arr[i]=pivate;
        arr[high]=temp;
        return i;
        
    }
    public static void sort(int []arr, int low, int high){
        if(low<high){
            int pivote=partition(arr, low, high);

            sort(arr, low, pivote-1);
            sort(arr, pivote+1, high);
        }
    }
    public static void main(String[] args) {

        int[]arr={4,1,2,5};
        sort(arr, 0, arr.length-1);
        for(int num:arr){
            System.out.print(num);
        }
        
    }
    
}
