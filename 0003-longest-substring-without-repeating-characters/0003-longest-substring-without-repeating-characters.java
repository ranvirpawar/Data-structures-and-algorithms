class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0){
            return 0;
        }
       int maxlen = 1;
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxlen = Math.max(maxlen, right-left);
            } 
            else{
                set.remove(s.charAt(left));
                left++;
            }
        }

        

        return maxlen;
    }   

}