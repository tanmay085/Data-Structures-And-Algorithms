package Array;

import java.util.Scanner;

public class SearchXInTwoDArray {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int row= sc.nextInt();
        int column=sc.nextInt();
        
        System.out.println("enter X :");
        int x=sc.nextInt();
        int number[][]=new int[row][column];

        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                number[i][j]=sc.nextInt();
            }
            System.out.println();
        }

        for(int i=0; i<row;i++){
            for(int j=0;j<column;j++){
                if(number[i][j]==3){
                    System.out.println("row"+i+"colunm"+j);
                }
            }
        }
        
        
    }
    
}
