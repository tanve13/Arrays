public class SquareOfSortedArray {

    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int left = 0, right = n - 1, index = n - 1;

        while (left <= right) {
            int leftSq = nums[left] * nums[left];
            int rightSq = nums[right] * nums[right];

            if (leftSq > rightSq) {
                result[index--] = leftSq;
                left++;
            } else {
                result[index--] = rightSq;
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] ans = sortedSquares(nums);

        for (int x : ans) {
            System.out.print(x + " ");
        }
        // Output: 0 1 9 16 100
    }
}
