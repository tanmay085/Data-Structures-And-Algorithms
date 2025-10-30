public class ZeroEnd {
    public static void main (String[]args){
        int []arr={1,2,0,0,2,4};
        int i=0;
        for(int x:arr){
           if(x!=0){
            arr[i]=x;
            i++;
           }
        }
        while(i<arr.length){
            arr[i]=0;
            i++;
        }
        for(int x:arr){
            System.out.print(x);
        }
    }
    
}

//Time complexity
//0(n)
