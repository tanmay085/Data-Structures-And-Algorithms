package Array;

import java.util.Scanner;

public class searchValueInArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value need to search: ");
        int x=sc.nextInt();

        int number[]= {1,2,4,3};
        for(int i=0; i<number.length;i++){
            if(number[i]==x){
                System.out.println(number[i]);
            }
        }
        
    }
    
}
