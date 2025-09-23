package Array;

import java.util.Scanner;

public class intToArray {
    public static void main(String[] args) {
        // Creating an Array
        int num[]=new int [3];

        // Insert number into array
        num[0]= 3;
        num[1]= 2;
        num[2]= 4;

        // Printing indivisual value in array
        System.out.print(num[1]);

        // Printing value in array
        for(int i=0;i<=2; i++){
            System.out.println(num[i]);
        }

        Scanner sc= new Scanner(System.in);
        int size=sc.nextInt();
        int number[]=new int[size];
        
        // Taking value from user
        for(int i=0;i<size;i++){
            number[i]=sc.nextInt();
        }
        for(int i=0;i<number.length;i++){
            System.out.println(number[i]);
        }

        
        



    }
    
}
