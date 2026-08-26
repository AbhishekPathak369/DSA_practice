class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // int i =0;
        // int j =0;
      for(int i= m; i< (m+n); i++){
        nums1[i] = nums2[i-m];
      }
      Arrays.sort(nums1);

        // while(i < (m+n)){
        //     if(nums1[i] <= nums2[j]){
        //         i++;
        //     }
        //     else if()
        // }
    }

}