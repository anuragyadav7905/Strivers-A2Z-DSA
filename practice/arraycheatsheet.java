import java.util.*;



public class arraycheatsheet {
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //Original
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));


        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }



    }
    
}
