public class SecondLargest {
    public static void main(String[] args) {
            int arr[]={8, 8, 7, 6, 5};
            int largest=arr[0];
            int secondLargest=Integer.MIN_VALUE;
            boolean same=false;
            for(int i=1; i<arr.length;i++){
                if(arr[0]==arr[i]){
                    same=true;
                }else{
                    same=false;
                    break;
                }
            }
            for(int i=1;i<arr.length-1;i++){
                if(largest<arr[i]){
                    secondLargest=largest;
                    largest=arr[i];
                }
                
            }
            if(same){
                System.out.print("-1");
            }else{
                System.out.print(secondLargest);
            }
            
            
            
    }
    
}
