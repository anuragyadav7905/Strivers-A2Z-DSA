// import java.util.*;
//  isomorphic{
//     public class isomorphic{
//         public static void main(String args[]){
//             Scanner sc=new Scanner(System.in);
//             String str1=sc.nextLine();
//             String str2=sc.nextLine();
//             sc.close();

//             if (str1.length() != str2.length()) {
//             System.out.println("False");
//             return;
//         }

//             int[] map1=new int[256];
//             int[] map2=new int[256];

//             for(int i=0;i<str1.length();i++){
//                 char c1=str1.charAt(i);
//                 char c2=str2.charAt(i);

//                 if(map1[c1]!=map2[c2]){
//                     System.out.println("False");
//                     return;
//                 }

//                 map1[c1]=i+1;
//                 map2[c2]=i+1;


//             }
//             System.out.println("True");
//         }
//     }




import java.util.Scanner;

public class isomorphic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        sc.close();

        // Step 1: length check
        if (str1.length() != str2.length()) {
            System.out.println("False");
            return;
        }

        int[] map1 = new int[256];
        int[] map2 = new int[256];

        for (int i = 0; i < str1.length(); i++) {
            char c1 = str1.charAt(i);
            char c2 = str2.charAt(i);

            // Step 2: check mapping
            if (map1[c1] != map2[c2]) {
                System.out.println("False");
                return; // 🔥 stop immediately
            }

            // Step 3: store mapping
            map1[c1] = i + 1;
            map2[c2] = i + 1;
        }

        System.out.println("True");
    }
}