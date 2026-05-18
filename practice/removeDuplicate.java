import java.util.*;
public class removeDuplicate{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>();
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        sc.close();

        for(int i=1;i<list.size();i++){
            if(list.get(i).equals(list.get(i-1))){
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

    }
}