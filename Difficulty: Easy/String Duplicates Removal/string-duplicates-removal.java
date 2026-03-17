// User function Template for Java

class Solution {
    String removeDuplicates(String s) {
        boolean[] seen = new boolean[256];
        String result="";
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            
            if(!seen[c]){
                result+=c;
                seen[c]=true;
            }
        }
        return result;
    }
}
