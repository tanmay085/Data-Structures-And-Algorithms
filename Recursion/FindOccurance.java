public class FindOccurance {
    public static int start=-1;
    public static int last=-1;
    public static void findOccurnace(String name, int i, char ele){
        if(i==name.length()){
            System.out.println(start+" "+last);
            return;
        }

        char curChar=name.charAt(i);
        if(curChar==ele){
            if(start==-1){
                start=i;
            }else{
                last=i;
            }
        }
        findOccurnace(name, i+1, ele);
    }
    public static void main(String[] args) {
        findOccurnace("asdfsdacadfasd", 0, 'a');
    }
}
