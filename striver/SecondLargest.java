public class SecondLargest {
    public static void main(String[] args) {
        int []arr={8,8,8,8};
            
            int large=Integer.MIN_VALUE;
            int secoundLarge=Integer.MIN_VALUE;
            for(int x:arr){
                if(x>large){
                    secoundLarge=large;
                    large=x;
                }else if(x>secoundLarge && x<large ){
                    secoundLarge=x;
                }
                    
               
            }
            if(secoundLarge==Integer.MIN_VALUE){
                System.out.print("-1");
            }else{
                System.out.print(secoundLarge);
            }
            

            
            
    }
    
}

//Time complexity
//0(n)
