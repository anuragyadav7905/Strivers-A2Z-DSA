import java.util.*;
public class rotate{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int d=sc.nextInt();
    sc.close();

    d=d%n;

    reverseArr(arr,0,d-1);
    reverseArr(arr,d,n-1);
    reverseArr(arr,0,n-1);

    for(int i=0;i<n;i++){
    System.out.print(arr[i] + " ");
    }
}

public static void reverseArr(int[] arr,int left,int right){

    while(left<right){
        int temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
        left++;
        right--;
    }

}

}
