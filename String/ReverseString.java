package String;


public class ReverseString {
    public static void main(String[] args) {
        
        StringBuilder sb=new StringBuilder("chatGpt");
        int j=0;
        for(int i=0;i<sb.length()/2;i++){
           int front=i;
           int back=sb.length()-i-1;

           sb.setCharAt(front, sb.charAt(back));
           sb.setCharAt(back, sb.charAt(front));
        }
        System.out.print(sb);
    }
    
}
