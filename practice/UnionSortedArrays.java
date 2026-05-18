import java.util.*;

public class UnionSortedArrays {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // size of first array
        int m = sc.nextInt();  // size of second array

        int a[] = new int[n];
        int b[] = new int[m];
        // input first array
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        // input second array
        for(int i = 0; i < m; i++){
            b[i] = sc.nextInt();
        }


        TreeSet<Integer> set=new TreeSet<>();
        for(int i=0;i<n;i++){
            set.add(a[i]);
        }
        for(int i=0;i<m;i++){
            set.add(b[i]);
        }

        for(int num:set){
            System.out.print(num);
        }

        sc.close();
    }
}