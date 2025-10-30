
public class Practice {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 2, 4, 4};
        int ans = 0;

        for (int num : arr) {
            ans ^= num; // XOR all numbers
        }

        System.out.println(ans);
    }
    
}
