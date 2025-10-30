

public class LongestSubArray{
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 7, 20, 9};
        int target = 15;

        int i = 0;
        int j = 0;
        int sum = 0;
        int maxLen = 0;

        while(j<arr.length){
            sum+=arr[j];
            while(sum>target && i<=j){
                sum-=arr[i];
                i++;
            }
            if(sum==target){git
                maxLen=Math.max(maxLen, j-i+1);

            }
            j++;
        }
        System.out.print(maxLen);

    }
}