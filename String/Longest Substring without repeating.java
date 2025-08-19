class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashSet<Character> set = new HashSet<>();
        int start=0;
        int end=0;
        int max_len=0;

        while(end<s.length()){
            if(!set.contains(s.charAt(end))){
                set.add(s.charAt(end));
                end++;
                max_len = Math.max(max_len,set.size());
            }
            else{
                set.remove(s.charAt(start));
                start++;
            }
        }
        return max_len;
    }
}
