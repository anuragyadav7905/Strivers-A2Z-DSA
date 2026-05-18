import java.util.*;
public class mostFrequent{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        sc.close();

        int[] freq=new int[26];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            freq[c-'a']++;
        }
        //result
        int maxFreq=-1;
        char result='z';

        for(int i=0;i<26;i++){
            if(freq[i]>maxFreq){
                maxFreq = freq[i];
                result=(char)(i+'a');
            }
            else if(freq[i]==maxFreq){
                char current=(char)(i+'a');
                if(current<result){
                    result=current;
                }

            }
        }
        System.out.println(result);

    }
}