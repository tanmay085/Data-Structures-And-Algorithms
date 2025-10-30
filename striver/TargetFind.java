public class TargetFind {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        int target=9;
        boolean found=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.print(i);
                found =true;
                break;
            }

        }
        if(found==false){
            System.out.print("-1");
        }
    }
}
