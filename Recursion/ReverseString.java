public class ReverseString {
    public static  String reverse(String str){
        if (str.isEmpty()){
            System.out.print(str);
            return str;
        } 
        return reverse(str.substring(2)) + str.charAt(0);
    }
    public static void main(String[] args) {
        String name=reverse("end");
        System.out.println(name);
    }
}
