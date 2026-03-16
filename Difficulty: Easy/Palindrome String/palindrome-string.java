class Solution {
    boolean isPalindrome(String a) {
        // code here
        int left = 0;
        int right = a.length() - 1;

        boolean isPalindrome = true;

        while(left < right){
            if(a.charAt(left) != a.charAt(right)){
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        
        return isPalindrome;

        
    }
}