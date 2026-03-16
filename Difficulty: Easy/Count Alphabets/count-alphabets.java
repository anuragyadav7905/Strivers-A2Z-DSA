// User function Template for Java

class Solution {
    static int Count(String S) {
        // code here
        
        char[] c=S.toCharArray();
        int count=0;
        
        for(int i=0;i<S.length();i++){
            if(Character.isLetter(c[i])){
                count++;
            }
        }
        return count;
    }
}