public class ReverseBits {

    static class Solution {
        // Reverse Bits
        public int reverseBits(int n) {
            int result = 0;

            for (int i = 0; i < 32; i++) {
                result <<= 1;        // Shift result left
                result |= (n & 1);   // Add last bit of n
                n >>>= 1;            // Unsigned shift right
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int input = 43261596; // Example
        int output = sol.reverseBits(input);

        System.out.println("Reversed Bits Output: " + output);
    }
}
