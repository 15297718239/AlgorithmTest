package DynamicProgramming;

public class MaxSubArray {
    public static int maxsubArry(int[] nums) {
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i] += Math.max(nums[i - 1], 0);
            res = Math.max(res, nums[i]);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{3, 4, 5, 6, -5};
        System.out.println(maxsubArry(nums));
    }
}
