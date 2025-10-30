public class RotateD {
    public static void main(String[] args) {
        int []arr={3, 4, 1, 5, 3, -5};
        int target=8;
        
        for(int k=0;k<target;k++){
            
            int num=arr[0];
            for(int i=0;i<arr.length-1;i++){
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=num;
        }
         for(int x:arr){
                System.out.print(x);
            }


        //Time Complexity
        //0(n^2)
        
        


    }
    
}


