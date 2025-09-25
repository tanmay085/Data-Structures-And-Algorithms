package String;

import java.util.Scanner;

public class Strings {
    public static void  main(String[]args){

        // Declaration of String
        String name="tanmay";
        String surname="buchade";

        // Concatation
        String fullname=name+" "+surname;

        System.out.println(fullname);

        // Taking Input from user
        Scanner sc= new Scanner(System.in);
        String sub=sc.nextLine();


        // CharAt

        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

        // Compare
        String name2="tanmay";
        if(name.compareTo(name2)==0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String are not equal");
        }
        
        // Do not use == to cheack String equality
        // It Work here perfect
        if(name==name2){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String are not equal");
        }

        // It doesn't work here
        if(new String("tanmay")==new String("tanmay")){
            System.out.println("Strings are equal");
        }else{
            System.out.println("String are not equal");
        }



        // SubString
        String name3=name2.substring(0,name.length());
        System.out.println(name3);


        // Convert string into integer
        String str="123";
        int number=Integer.parseInt(str);

        // Convert integer into string
        int num=1222;
        String str1 = Integer.toString(num);


        // Strings are Immutable
        

    }
    
}
