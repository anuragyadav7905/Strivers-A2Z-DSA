import java.util.*;

public class equilibrium {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();      // array size
        int arr[] = new int[n];

        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }

        int result = equilibriumIndex(arr);

        System.out.println(result);

        sc.close();
    }

    public static int equilibriumIndex(int arr[]) {

        int totalSum = 0;

        for(int i = 0; i < arr.length; i++){
            totalSum += arr[i];
        }

        int leftSum = 0;

        for(int i = 0; i < arr.length; i++){

            int rightSum = totalSum - leftSum - arr[i];

            if(leftSum == rightSum){
                return i + 1; // 1-based index
            }

            leftSum += arr[i];
        }

        return -1;
    }
}