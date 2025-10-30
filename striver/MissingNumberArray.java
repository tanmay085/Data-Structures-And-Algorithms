public class MissingNumberArray {
    public static void main(String[] args) {
        int []arr={6,5,3,2};
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0; i<arr.length-1;i++){
            if(arr[i]+1!=arr[i+1]){
                System.out.println(arr[i]+1);
            }
        }
        for(int x:arr){
            System.out.print(x);
        }
    }
}


