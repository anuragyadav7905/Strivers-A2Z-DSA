// import java.util.*;
// public class subset{
//     public static void main(String args[]){
//         Scanner sc =new Scanner(System.in);
//         int size1=sc.nextInt();
//         int a[]=new int[size1];
//         for(int i =0;i<size1;i++){
//             a[i]=sc.nextInt();
//         }
//         int size2=sc.nextInt();
//         int b[]=new int[size2];
//         for(int i =0;i<size2;i++){
//             b[i]=sc.nextInt();
//         }
//         sc.close();

//         boolean isSubset=true;

//         for(int i=0;i<size2;i++){
//             boolean found=false;

//             for(int j=0;j<size1;j++){
//                 if(b[i]==a[j]){
//                     found=true;
//                     break;
//                 }
//             }
//             if(!found){
//                 isSubset=false;
//                 break;
//             }
//         }
//         System.out.println(isSubset);

//     }
// }




//hashset

import java.util.*;
public class subset{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int size1=sc.nextInt();
        int a[]=new int[size1];
        for(int i =0;i<size1;i++){
            a[i]=sc.nextInt();
        }
        int size2=sc.nextInt();
        int b[]=new int[size2];
        for(int i =0;i<size2;i++){
            b[i]=sc.nextInt();
        }
        sc.close();

        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<size1;i++){
            set.add(a[i]);
        }
        boolean isSubset=true;

        for(int i=0;i<size2;i++){
            if(!set.contains(b[i])){
                isSubset=false;
                break;
            }
        }
        System.out.println(isSubset);
    }
}