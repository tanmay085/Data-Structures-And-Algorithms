public class RemoveDuplicate {
    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,3,4};
        int i = 0; 
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j]; 
            }
        }

        System.out.print(i+1);
        


    
    }
}

//Time complexity 
//0(n)



