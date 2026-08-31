import java.util.*;

class Solution {
    public boolean canPartition(int[] nums) {

        int n = nums.length;

        // 🔢 Step 1: total sum निकालो
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += nums[i];
        }

        // ❌ अगर sum odd है → equal partition impossible
        if(sum % 2 != 0) return false;

        // 🎯 target = sum/2 (hume sirf itna subset banana hai)
        int target = sum / 2;

        // dp[index][currentSum] = -1 (not visited), 0 (false), 1 (true)
        int dp[][] = new int[n][target + 1];

        // initially sab -1
        for(int i = 0; i < n; i++){
            Arrays.fill(dp[i], -1);
        }

        // recursion start (index=0, sum=0)
        int ans = help(nums, dp, 0, 0, target);

        return ans == 1;
    }

    public static int help(int nums[], int dp[][], int count, int n, int target){

        // ❗ CONFUSION: ye main goal hai (NOT count == sum-count)
        // 🎯 agar target mil gaya → success
        if(count == target) return 1;

        // 🚫 agar array khatam ho gaya → fail
        if(n >= nums.length) return 0;

        // 🚫 agar sum exceed ho gaya → useless path
        if(count > target) return 0;

        // ⚡ memoization (already solved case)
        if(dp[n][count] != -1) return dp[n][count];

        // ✅ choice 1: element lo
        int take = help(nums, dp, count + nums[n], n+1, target);

        // ❌ choice 2: element skip karo
        int left = help(nums, dp, count, n+1, target);

        // result store karo
        return dp[n][count] = (take == 1 || left == 1) ? 1 : 0;
    }
}