package String;

import java.util.Scanner;

public class CumulativeLength {
    public static void main(String []args){

        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        String name[]= new String[size];

        int toLength=0;

        for(int i=0;i<=size;i++){
            name[i]=sc.nextLine();
            toLength+=name[i].length();
        }
        System.out.println(toLength);


    }
    
}
