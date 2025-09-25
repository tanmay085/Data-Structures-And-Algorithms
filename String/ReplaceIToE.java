package String;
import  java.util.*;

public class ReplaceIToE {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        String result="";

        for(int i=0;i<name.length();i++){
            if(name.charAt(i)=='i'){
                result+="e";

            }else{
                result+=name.charAt(i);
            }
        }
        System.out.println(result);

    }
    
}
