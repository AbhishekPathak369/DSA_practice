class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;

        for(int i = 0; i< n; i++){
            int curr = nums1[i];
            int now =-1;
            int check=0;
            for(int j =0; j< m; j++){

                if(curr == nums2[j]) check =1;
                     if( check ==1 &&  curr < nums2[j]){
                        now = nums2[j];
                        break;

                     }

            }
            nums1[i]= now;
        }
        return nums1;
    }
}