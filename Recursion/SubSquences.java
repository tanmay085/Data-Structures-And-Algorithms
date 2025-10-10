public class SubSquences {
    public static void sequenceSub(String word, int idx, String newString){
        if(word.length()==idx){
            System.out.println(newString);
             return;
        }
        char currentChar=word.charAt(idx);
         sequenceSub(word, idx+1, newString+currentChar);
        sequenceSub(word, idx+1, newString);
    }
    public static void main(String[] args) {
        sequenceSub("abc", 0, "");
    }
    
}
