

public class Print1To5 {
    public void printN(int n){
        if(n==5){
            return;
        }
        System.out.println(n);
        printN(n+1);   
        System.out.println(n);
    }
    public static void main(String[] args) {
        
        Print1To5 print1To5=new Print1To5();
        print1To5.printN(1);
    }
    
}
