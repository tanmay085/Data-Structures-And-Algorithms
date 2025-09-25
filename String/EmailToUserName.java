package String;
import java.util.*;

public class EmailToUserName {
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
    }
    
}
