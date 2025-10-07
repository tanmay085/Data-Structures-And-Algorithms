public class Reverse {
    public static void reverseString(String name,int i){
        if(i<0){
            return;
        }
        System.err.print(name.charAt(i));
        reverseString(name, i-1);
        
    }
    public static void main(String[] args) {
        String name="tanmay";
        int i=name.length()-1;
        reverseString(name, i);
    }
    
}
