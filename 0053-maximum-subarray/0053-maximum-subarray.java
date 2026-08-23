class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int sum =0;
        if(n ==1) return nums[0];
         int r =0;
         while(r< n){
            sum += nums[r];
             max = Math.max(max,sum);
            if( sum <0) sum =0;

           
            r++;
         }
return max;
    }
}