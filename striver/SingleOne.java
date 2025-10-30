public class SingleOne {
    public static void main(String[] args) {
        int []arr={1,2,1,3,2,4,4};
        int i=0;
        int j=arr.length-1;
        while(i!=j){
            if(arr[i]==arr[j]){
                int temp=arr[j];
                arr[j]=arr[i+1];
                arr[i+1]=temp;
                i+=2;
                j=arr.length;
            }
            j--;
        }
        System.out.print(arr[i]);
    }
    
}
