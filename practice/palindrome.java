import java.util.*;
public class palindrome{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        sc.close();
        int left=0;
        int right=a.length()-1;

        boolean isPalindrome=true;

        while(left<right){
            if(a.charAt(left)!=a.charAt(right)){
                isPalindrome=false;
                break;
            }
            left++;
            right--;
        }
        System.out.println(isPalindrome);

    }
}