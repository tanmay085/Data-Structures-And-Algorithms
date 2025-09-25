package String;
import java.util.*;

public class EmailToUserName {
    public void StringBuilderEmailTouser(){
        StringBuilder sb=new StringBuilder("mayur@gmail.com");
        for(int i=0;i<sb.length();i++){
            if(sb.charAt(i)=='@'){
                sb.delete(i, sb.length());
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String email=sc.nextLine();
        String result=" ";
        for(int i=0;i<email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }else{
                result+=email.charAt(i);
            }
        }
        System.out.print(result);
    EmailToUserName emtou=new EmailToUserName();
    emtou.StringBuilderEmailTouser();
    }
    
}
