// User function Template for Java

class Solution {

    static ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> result=new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                result.add(arr[i]);
            }
        }
        return result;

    }
}