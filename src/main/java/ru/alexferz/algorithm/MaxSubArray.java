package ru.alexferz.algorithm;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 4, -2, 2, 1, -3};
        int[] nums2 = {-10, -2, 0, -4, -5};
        int[] nums3 = {-5, -1, -34, -4, -5};
        int[] nums4 = {1, -3, 4, 1, -2, 5};
        System.out.println(maxSubArraySum(nums));
        System.out.println(maxSubArraySum(nums2));
        System.out.println(maxSubArraySum(nums3));
        System.out.println(maxSubArraySum(nums4));
    }

    private static int maxSubArraySum(int[] nums) {
        int maxSum = nums[0];
        int l = 0;
        int r = 0;
        int currentSum = nums[0];
        int prevSum = nums[0];
        while (l != nums.length - 1 && r != nums.length - 1) {
            if (currentSum <= 0) {
                r++;
                l = r;
                currentSum = nums[l];
                prevSum = nums[l];
            } else if (l == r || currentSum > prevSum || nums[l] > 0) {
                r++;
                prevSum = currentSum;
                currentSum = currentSum + nums[r];
            } else {
                l++;
                prevSum = currentSum;
                currentSum = currentSum - nums[l - 1];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }
        return maxSum;
    }
}
