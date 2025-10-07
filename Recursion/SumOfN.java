public class SumOfN {
    public static int printSumN(int n){
        if(n==0){
            return 0;
        }
        
        return n+printSumN(n-1);
    }
    public static void main(String[]args){
       int ans= printSumN(5);
       System.out.print(ans);
    }
    
}
