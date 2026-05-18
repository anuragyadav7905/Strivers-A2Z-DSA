import java.util.*;
public class toggleCase{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();

        String result="";

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isUpperCase(c)){
                result+=Character.toLowerCase(c);
            }
            if(Character.isLowerCase(c)){
                result+=Character.toUpperCase(c);
            }
        }
        System.out.println(result);
    }
}