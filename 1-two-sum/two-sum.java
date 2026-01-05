import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];

            // Check if the required number exists
            if (map.containsKey(need)) {
                return new int[] { map.get(need), i };
            }

            // Store current number with its index
            map.put(nums[i], i);
        }

        return new int[] {}; // No solution (won't happen as per problem)
    }
}
