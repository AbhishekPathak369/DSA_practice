class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
         int il =0;
          int jl =0;
        for(int i=0; i< n; i++){
            for(int j =i+1; j< n; j++){
                if(target == nums[i]+ nums[j]){
il =i;
jl =j;
break;
                }
            }
        }
        // int i=0;
        // int j=0;
        // int l =0;
        
        //  int r = nums.length-1;
         
        //  while(l < r){
        //     int val = nums[l] + nums[r];
        //     if(target == val){
        //         i=l;
        //         j=r;
        //         break;
        //     }
        //    else if(val < target){
        //         l++;
        //     }
        //     else{
        //         r--;
        //     }
        //  }
         return new int[]{il,jl};
    }
}