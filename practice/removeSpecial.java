import java.util.*;
public class removeSpecial{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();

        String result="";

        for(char c:str.toCharArray()){
            if(Character.isLetter(c)){
                result+=c;
            }
        }
        System.out.println(result);
    }
}