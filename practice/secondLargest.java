import java.util.*;
public class secondLargest{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.close();
        int ans=second(arr,n);
        System.out.print(ans);
    
    }
        public static int second(int arr[],int n){
            int a=Integer.MIN_VALUE;
            int b=Integer.MIN_VALUE;

            for(int i=0;i<n;i++){
                if(arr[i]>a){
                    b=a;
                    a=arr[i];
                }
                else if(arr[i]>b && arr[i]!=a){
                    b=arr[i];
                }
            }
            return b;
        }
    }