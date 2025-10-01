public class SumOfN {
    public void printSumN(int n,int add){
        if(n==0){
            System.out.println(add);
            return;
        }
        add+=n;
        printSumN(n-1, add);
    }
    public static void main(String[]args){
        SumOfN sum=new SumOfN();
        int add=0;
        sum.printSumN(5,add);
    }
    
}
