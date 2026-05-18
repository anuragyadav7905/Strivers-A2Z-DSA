// import java.util.*;
// public class anagram{
//     public static void main(String Args[]){
//         Scanner sc=new Scanner(System.in);
//         String a=sc.next();
//         String b=sc.next();

//         char[] c1=a.toCharArray();
//         char[] c2=b.toCharArray();

//         Arrays.sort(c1);
//         Arrays.sort(c2);

//         if(Arrays.equals(c1,c2)){
//             System.out.println("true");
//         }else{
//             System.out.println("false");
//         }
//     }

// }



import java.util.*;
import java.util.Scanner;*;
public class anagram{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        sc.close();

        if(s1.length()!=s2.length()){
            System.out.println(false);
            return;
        }

        int[] freq=new int[26];

        for(int i=0;i<freq.length;i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }

        boolean isAnagram = true;

        for(int i=0;i<26;i++){
            if(freq[i]==0){
                isAnagram=false;
                break;
            }
        }
        System.out.println(isAnagram);
        
    }
}