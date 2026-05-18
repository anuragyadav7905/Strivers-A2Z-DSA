import java.util.*;
public class smallerLarger{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();

        sc.close();
        String[] words=s.split(" ");

        String smallest=words[0];
        String largest=words[0];

        for(int i=1;i<words.length;i++){
            if(smallest.length()>words[i].length()){
                smallest=words[i];
            }
            if(largest.length()<words[i].length()){
                largest=words[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }
}