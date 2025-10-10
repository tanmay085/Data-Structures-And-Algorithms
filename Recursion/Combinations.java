public class Combinations {
    public static void perCombination(String str, String combination){
        if(str.length()==0){
            System.out.println(combination);
            return;
        }
        for(int i=0; i<str.length();i++){
            char currentChar=str.charAt(i);
            String newString= str.substring(0,i)+str.substring(i+1);
            perCombination(newString, combination+currentChar);
        }
    }

    public static void main(String[] args) {
        perCombination("abc", "");
    }
    
}
