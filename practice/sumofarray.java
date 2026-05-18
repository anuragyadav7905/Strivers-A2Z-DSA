// import java.util.*;
// public class sumofarray{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//         }
//         sc.close();

//         int sum=0;

//         for(int i=0;i<n;i++){
//             sum+=arr[i];
//         }
//         System.out.println(sum);

//     }
// }

//other way during input

// import java.util.*;
// public class sumofarray{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int sum=0;
//         int n=sc.nextInt();
//         int arr[]=new int[n];

//         for(int i=0;i<n;i++){
//             sum+=sc.nextInt();
//         }
//         System.out.println("The sum is "+sum);
//     }
// }

//function

import java.util.*;
public class sumofarray{
    public static int findSum(int arr[],int n){
        int s=0;
        for(int i=0;i<n;i++){
            s+=arr[i];
        }
        return s;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int sum=findSum(arr,n);
        System.out.println("the function " +sum);
        System.out.println("the mean "+(sum/n));
        
    }
}


//other

// import java.util.*;

// public class sumofarray {

//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         for(int i = 0; i < n; i++){
//             arr[i] = sc.nextInt();
//         }

//         int sum = findSum(arr, n);

//         System.out.println("the function " + sum);

//         sc.close();
//     }

//     public static int findSum(int arr[], int n){
//         int s = 0;

//         for(int i = 0; i < n; i++){
//             s += arr[i];
//         }

//         return s;
//     }
// }