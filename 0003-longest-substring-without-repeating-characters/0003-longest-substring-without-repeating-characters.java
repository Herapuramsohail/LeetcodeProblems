class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int right = 0;
        int max = 0;

        while( right < s.length()){
            char currentchar = s.charAt(right);
            while(set.contains(currentchar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentchar);
            max = Math.max(max, right-left +1);
            right++; 
            
        }
        return max;
    }
}