import java.util.*;
public class encryptString{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();

        LinkedHashMap<Character,Integer> set=new LinkedHashMap<>();

        //put in set c,i;
        for(char c:str.toCharArray()){
            set.put(c,set.getOrDefault(c,0)+1);
        }
        String temp="";

        //iterate in hashMap

        for(char c:set.keySet()){
            temp+=c;
            temp+=set.get(c);
        }

        String result=new StringBuilder(temp).reverse().toString();

        System.out.println(result);
    }
}