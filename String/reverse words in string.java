class Solution {
    public String reverseWords(String s) {
        
        String reversed = "";
        String[] rev = s.split(" ");
        for(int i=rev.length-1;i>=0 ;i--){
            reversed +=rev[i] +" ";
        }
        StringBuilder a =new StringBuilder (reversed);
        a.reverse();
        return new String (a.substring(1,a.length()));
        
    }
}
