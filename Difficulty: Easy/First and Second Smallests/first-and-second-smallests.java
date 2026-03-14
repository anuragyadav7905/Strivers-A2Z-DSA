import java.util.*;

class Solution {
    public ArrayList<Integer> minAnd2ndMin(int[] arr) {

        ArrayList<Integer> result = new ArrayList<>();

        int min = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            
            if(arr[i] < min){
                second = min;
                min = arr[i];
            }
            else if(arr[i] < second && arr[i] != min){
                second = arr[i];
            }
        }

        if(second == Integer.MAX_VALUE){
            result.add(-1);
        } else {
            result.add(min);
            result.add(second);
        }

        return result;
    }
}