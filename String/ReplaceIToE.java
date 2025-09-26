package String;
import java.util.*;

public class ReplaceIToE {
    public void usingStringBuilder(){
        StringBuilder sb=new StringBuilder("ishan");
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='i'){
                sb.setCharAt(i, 'e');
            }
        }
        System.out.print(sb);
    }
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
        ReplaceIToE rt=new ReplaceIToE();
        rt.usingStringBuilder();

    }
    
}
