class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        if(s1.length() > s2.length()){
            return false;
        }
        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character , Integer> windowMap = new HashMap<>();

        for(int i = 0; i < s1.length(); i++){
            char ch = s1.charAt(i);
            s1Map.put(ch, s1Map.getOrDefault(ch, 0 ) + 1);
        }
        for(int i = 0; i < s1.length(); i++){
            char ch = s2.charAt(i);
            windowMap.put(ch,windowMap.getOrDefault(ch,0) + 1);
        }
        if(windowMap.equals(s1Map)){
            return true;
        }
        for(int right = s1.length(); right < s2.length(); right++){
            char leftChar = s2.charAt(right - s1.length());
             windowMap.put(leftChar,windowMap.get(leftChar) - 1);
             if(windowMap.get(leftChar) == 0 ){
                windowMap.remove(leftChar);
             }
             char ch = s2.charAt(right);
             windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
             if (windowMap.equals(s1Map)) {
                return true;
                }
            
        }return false;
    }
}