public class Power {
    public static int calPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
      
        return x*calPower(x, n-1);
    }
    public static void main(String[] args) {
        int ans= calPower(3, 3);
        System.out.println(ans);
        
    }
    
}
