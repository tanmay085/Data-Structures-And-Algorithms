public class MoveXEnd {
    public static String ans="";
    public static int count=0;
    public static void moveX(String word, int i){
        if(word.length()==i){
            for(int j=0; j<count;j++){
                ans+='x';
            }
            System.out.print(ans);
            return;
        }
        if(word.charAt(i)=='x'){
            count+=1;
        }else{
            ans+=word.charAt(i);
        }
        moveX(word, i+1);

    }
    public static void main(String[] args) {
        moveX("acxxsddxd", 0);
    }
    
}
