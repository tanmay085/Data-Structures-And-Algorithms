public class DuplicateRemove {
    public static boolean []map=new boolean[26];
    public static void removeDuplicate(String name, int idx, String newString){
        if(name.length()==idx){
            System.out.print(newString);
            return;
        }
        char currentChar= name.charAt(idx);
        if(map[currentChar-'a']==true){
            removeDuplicate(name, idx+1, newString);
        }else{
            map[currentChar-'a']=true;
            newString+=currentChar;
            removeDuplicate(name, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        removeDuplicate("aaddcc", 0, "");
        
    }
    
}
