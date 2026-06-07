class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        int l, r;
        for (int i = 0; i < nums.length - 1; i++) {
            l = i + 1; r = nums.length - 1;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            while (l < r) {
                if ((nums[i] + nums[l] + nums[r]) == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    r--;
                }
                else if ((nums[i] + nums[l] + nums[r]) < 0) l++;
                else r--;
            }
        }
        return new ArrayList(res);
    }
}
