public class KeypadCombo {
    public static String []keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vw","xyz"};
    public static void keypadCombination(String num, String combination, int idx){
        if(num.length()==idx){
            System.out.println(combination);
            return;
        }
        char currentChar=num.charAt(idx);
        String mapping =keypad[currentChar-'0'];
        for(int i=0;i<mapping.length();i++){
            keypadCombination(num, combination+mapping.charAt(i), idx+1);
        }
    }
    public static void main(String[] args) {
        keypadCombination("23", "", 0);
        
    }
}
