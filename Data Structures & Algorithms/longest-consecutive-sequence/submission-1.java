class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int longest = 0;
        for (int i : nums) set.add(i);
        for (int i : nums) {
            if (!set.contains(i - 1)) {
                int length = 1;
                int current = i;
                while (set.contains(current + 1)) {
                    current++;
                    length++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;
    }
}
