public class Palimdrom {
    public static Boolean checkPalindrom(String name, int start, int end){
        if(start>end){
            return true;
        }
        if(name.charAt(start)!=name.charAt(end)){
            return false;
        }
        return checkPalindrom(name, start+1, end-1);
    }
    public static void main(String[] args) {
        
        Boolean ans=checkPalindrom("taat", 0, 3);
        if(ans){
            System.out.print("String is palindrom");
        }else{
            System.out.print("String not palindrom");
        }
    }
    
}