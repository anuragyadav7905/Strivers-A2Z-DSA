import java.util.*;
public class removeVowel{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res="";
        sc.close();

        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c!='a' && c!='e' && c!='i' && c!='o' && c!='u'){
                res+=c;
            }
        }
        System.out.println(res);
    }
}