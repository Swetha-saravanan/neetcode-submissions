class Solution {
    public boolean isPalindrome(String s) {
        boolean palindrome = true;
        String str = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        System.out.println(str);
        int left = 0;
        int right = str.length() - 1;
        while(left < right ) {
            if(str.charAt(left) != str.charAt(right)) {
                palindrome = false;
            }
            left++;
            right--;
        }
        return palindrome;
    }
}
