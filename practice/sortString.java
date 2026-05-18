import java.util.*;
public class sortString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();

        char[] c=str.toCharArray();

        Arrays.sort(c);

        String result=new String(c);

        System.out.println(result);
    }
}