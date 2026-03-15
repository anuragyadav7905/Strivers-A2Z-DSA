import java.util.*;

class Solution {
    public List<Integer> frequencyCount(int[] arr) {
        
        int n = arr.length;
        int[] freq = new int[n];

        for(int i = 0; i < n; i++){
            if(arr[i] <= n){
                freq[arr[i]-1]++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for(int i = 0; i < n; i++){
            result.add(freq[i]);
        }

        return result;
    }
}