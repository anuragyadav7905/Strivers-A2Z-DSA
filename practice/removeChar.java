import java.util.*;
public class removeChar{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        sc.close();

        HashSet<Character> set=new HashSet<>();
        //add in set
        for(char c:s2.toCharArray()){
            set.add(c);
        }

        String result="";

        for(char c:s1.toCharArray()){
            if(!set.contains(c)){
                result+=c;
            }
        }
        System.out.println(result);
    }
}