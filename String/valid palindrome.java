class Solution {
    public boolean isPalindrome(String s) {
        boolean result;
        String sentance =s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder rev = new StringBuilder(sentance);
        rev.reverse();
        return sentance.equals( rev.toString());
        
    }
}
