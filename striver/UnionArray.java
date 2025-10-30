
import java.util.ArrayList;
import java.util.List;

public class UnionArray {
     public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4, 4};
        int[] arr2 = {1, 3, 4, 6, 6};
        
        List<Integer> ans = new ArrayList<>();
        int i = 0, j = 0;
        
        while (i < arr1.length && j < arr2.length) {
            // Skip duplicates in arr1
            while (i > 0 && i < arr1.length && arr1[i] == arr1[i - 1]) {
                i++;
            }
            // Skip duplicates in arr2
            while (j > 0 && j < arr2.length && arr2[j] == arr2[j - 1]) {
                j++;
            }
            if (i >= arr1.length || j >= arr2.length) break;
            
            if (arr1[i] < arr2[j]) {
                ans.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                ans.add(arr2[j]);
                j++;
            } else { // both equal
                ans.add(arr1[i]);
                i++;
                j++;
            }
        }
        
        // Add remaining unique elements
        while (i < arr1.length) {
            if (i == 0 || arr1[i] != arr1[i - 1])
                ans.add(arr1[i]);
            i++;
        }
        
        while (j < arr2.length) {
            if (j == 0 || arr2[j] != arr2[j - 1])
                ans.add(arr2[j]);
            j++;
        }

        System.out.println(ans);
    }
    
}

//time complexity 
//0(m+n)
