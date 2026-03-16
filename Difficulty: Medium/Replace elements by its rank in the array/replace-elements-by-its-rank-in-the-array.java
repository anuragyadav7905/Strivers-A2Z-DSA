// User function Template for Java

import java.util.*;

class Solution {
    static int[] replaceWithRank(int arr[], int N) {

        int temp[] = arr.clone();      // copy array
        Arrays.sort(temp);             // sort it

        HashMap<Integer,Integer> map = new HashMap<>();
        int rank = 1;

        for(int i = 0; i < N; i++){
            if(!map.containsKey(temp[i])){
                map.put(temp[i], rank);
                rank++;
            }
        }

        for(int i = 0; i < N; i++){
            arr[i] = map.get(arr[i]);
        }

        return arr;
    }
}