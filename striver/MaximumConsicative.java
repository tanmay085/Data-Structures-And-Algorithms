public class MaximumConsicative {
    public static void main(String[] args) {
        int []arr={1,1,1,0,0,1,1,0};
        int maxcount=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count+=1;
            }else{
                
                maxcount=Math.max(count, maxcount);
                count=0;
            }
        }
        System.out.println(maxcount);
    }
    
}
