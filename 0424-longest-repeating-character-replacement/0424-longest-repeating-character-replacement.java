class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character , Integer> map = new HashMap<>(); 
        int left = 0;
        int right = 0;
        int maxFreq = 0;
        int maxLength = 0;

        while(right < s.length()){
            char currentChar = s.charAt(right);
            map.put(currentChar, map.getOrDefault(currentChar,0) + 1);
            maxFreq = Math.max(maxFreq, map.get(currentChar));
            if((right - left + 1 ) - maxFreq > k){
                map.put(s.charAt(left), map.get(s.charAt(left)) -1);
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
            right++;
        }return maxLength;     
    }
}
