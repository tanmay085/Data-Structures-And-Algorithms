public class Factorial {
    public static void factorialOfN(int n, int fact){
        if(n==0){
            System.out.print(fact);
            return;
        }
        fact*=n;
        factorialOfN(n-1, fact);
    }
    public static void main(String[] args) {
        Factorial factorial=new Factorial();
        
        factorial.factorialOfN(5,1);
        
    }
    
}
