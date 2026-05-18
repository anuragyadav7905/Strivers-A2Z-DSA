import java.util.*;
public class removeDuplicatesString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();

        boolean seen[]=new boolean[256];
        StringBuilder result=new StringBuilder();

        for(int i= 0;i < str.length() ; i++){
            char c=str.charAt(i);

            if(!seen[c]){
                result.append(c);
                seen[c]=true;
            }
        }
        System.out.println(result.toString());
    }
}