

public class CheckSorted {
    public static void check(int[]num,int i){
        if(num.length-2==i-1){
            System.out.println("array is sorted");
            return;
        }
        if(num[i]>=num[i+1]){
            System.err.println("array is not sorted");
            return;
        }
       
        check(num, i+1);
    }
    public static void main(String[] args) {
        int[]num={1,2,3,3};
        check(num, 0);
    }
    
}
