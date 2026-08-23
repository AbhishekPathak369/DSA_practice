class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int sum=0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int rc =0;
        int r =0;
        int tot =0;
        for(int i: nums){
            tot += i;
        }
          while(r < n ){
        sum+= nums[r];
        max = Math.max(max,sum);
        if(sum <0) sum =0;
        r++;
    }
    if (max < 0)
    return max;

    sum =0;
    while(rc < n ){
        sum+= nums[rc];
        min = Math.min(min,sum);
        if(sum >0) sum =0;
        rc++;
    }
    int cir= tot - min;
    return Math.max(max,cir);
    }
}