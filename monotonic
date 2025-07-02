class Solution {
    public boolean isMonotonic(int[] nums) {
        Boolean inc=false;
        Boolean dec=false;
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1] ){
                inc=true;
                
            }
            if(nums[i]>nums[i+1]){
                dec=true;
            }
            
        }
        
        return !(inc && dec);
    }
}
