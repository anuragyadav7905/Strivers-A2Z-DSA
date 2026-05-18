import java.util.*;
public class largest{
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int largest=findLargest(arr);
        System.out.println("The largest number is " + largest);
    }
    public static int findLargest(int[] arr){
        if(arr.length==0) return -1;
        if(arr.length==1) return arr[0];
        int large=arr[0];
        for(int i=1;i<arr.length;i++){
            if(large<arr[i]){
                large=arr[i];
            }
        }
        return large;
        
    }
}