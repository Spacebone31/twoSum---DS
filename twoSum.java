package twoSum;

public class twoSum {
    public static int[] twoSum(int[] nums, int target) {
        int minDiff = Integer.MAX_VALUE;
        int[] result = {-1, -1};
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                int diff = Math.abs(target - sum);
                if (diff < minDiff) {
                    minDiff = diff;
                    result = new int[]{i, j};
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 99;

        long startTime = System.nanoTime(); // Record the start time

        int[] result = twoSum(nums, target);

        long endTime = System.nanoTime(); // Record the end time

        System.out.print("Input: nums = [");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]);
            if (i < nums.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("], target = " + target);
        System.out.println();
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");

        double timeTaken = (endTime - startTime) / 1_000_000.0; // convert nanoseconds to seconds
        System.out.printf("Time taken: %.3f seconds%n", timeTaken);
    }

}
