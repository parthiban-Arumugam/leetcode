class Solution {
    public int[] getConcatenation(int[] nums) {
       int result[]=new int[nums.length*2];
       int i=0;
       int count=0;
       int j=0;
       while(count<result.length){
        result[i]=nums[j];
        i++;
        j++;
        if(j==nums.length){
            j=0;
        }
        count++;
       }
    return result;
        
    }
}
