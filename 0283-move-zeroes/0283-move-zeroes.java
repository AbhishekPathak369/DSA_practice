class Solution {
    public void moveZeroes(int[] nums) {
        int i =0;
        int j =0;
       while(j < nums.length&& nums[j] != 0 ){
        j++;
       }
     i =j;
     j = j+1;


        while(j< nums.length){
            if(nums[j] !=0 ) {
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
               
                i++;
            }
             
            j++;
        }
    }
}