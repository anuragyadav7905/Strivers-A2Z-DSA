import java.util.*;
public class romanToDecimal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        sc.close();
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result=0;

        for(int i=0;i<str.length();i++){
            int curr=map.get(str.charAt(i));
            if(i<str.length()-1){
                int next=map.get(str.charAt(i+1));
            if(curr<next){
                result-=curr;
            }else{
                result+=curr;
            }
        }
            else{
                result+=curr;
            }
        }
        System.out.println(result);
    }
}