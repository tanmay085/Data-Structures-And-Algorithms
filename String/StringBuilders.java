package String;
import java.util.*;


public class StringBuilders {
    public static void main(String[] args) {
        
        // declaring StringBuilder
        StringBuilder sb=new StringBuilder("tanmay");


        // Taling input from user
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine();
        StringBuilder name1=new StringBuilder(name);

        // SetAt
        sb.setCharAt(0, 'r');

        // Insert at begining
        sb.insert(0, "t");

        // CharAt
        System.out.print(sb.charAt(0));


        // Remove Charcter
        sb.delete(0, 1);


        // Append 
        // Add at the end
        sb.append("r");
        System.out.print(sb);


        

    }
}
