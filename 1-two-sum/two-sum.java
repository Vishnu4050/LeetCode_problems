import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[][] pair = new int[n][2];
        
        for (int i = 0; i < n; i++) {
            pair[i][0] = nums[i];
            pair[i][1] = i;
        }
        
        Arrays.sort(pair, (a, b) -> Integer.compare(a[0], b[0]));
        
        int left = 0, right = n - 1;
        while (left < right) {
            int sum = pair[left][0] + pair[right][0];
            if (sum == target) {
                return new int[]{pair[left][1], pair[right][1]};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        // No solution found - depending on constraints, you can throw an exception
        throw new IllegalArgumentException("No two sum solution");
    }
}