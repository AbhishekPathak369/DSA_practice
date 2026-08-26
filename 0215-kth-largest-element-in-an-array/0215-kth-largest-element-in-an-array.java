class Solution {
    public int findKthLargest(int[] nums, int k) {
        int n = nums.length;
        Arrays.sort(nums);
        HashSet<Integer> hs = new HashSet<>();
        int ans =n-k;
      
        return nums[ans];
    }
}