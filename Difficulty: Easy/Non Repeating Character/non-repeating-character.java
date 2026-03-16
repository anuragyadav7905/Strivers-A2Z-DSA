class Solution {
    static char nonRepeatingChar(String s) {
        
        int freq[] = new int[26];
        
        // count frequency
        for(int i = 0; i < s.length(); i++){
            freq[s.charAt(i) - 'a']++;
        }
        
        // find first non-repeating
        for(int i = 0; i < s.length(); i++){
            if(freq[s.charAt(i) - 'a'] == 1){
                return s.charAt(i);
            }
        }
        
        return '$';
    }
}