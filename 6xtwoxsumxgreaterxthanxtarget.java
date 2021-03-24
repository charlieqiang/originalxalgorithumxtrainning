// Description
// Given an array of integers, find how many pairs in the array such that their sum is bigger than a specific target number. Please return the number of pairs.

public class Solution {
    /**
     * @param nums: an array of integer
     * @param target: An integer
     * @return: an integer
     */
    public int twoSum2(int[] nums, int target) {

        // 1xinit
        int res = 0;
        int left = 0;
        int right = nums.length - 1;
        Arrays.sort(nums);
        // 2xcheckxnullxout
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // 3x
        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum <= target) {
                left++;
            } else {
                res += right - left;
                right--;
            }
        }

        return res;
    }
}