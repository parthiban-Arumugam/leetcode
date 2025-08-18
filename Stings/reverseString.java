class Solution {
    public void reverseString(char[] s) {
        char [] rev= new char[s.length];
        int count=0;
        for(int i=s.length-1;i>=0;i--){
            rev[count]=s[i];
            count++;
        }
        
        
    }
}
