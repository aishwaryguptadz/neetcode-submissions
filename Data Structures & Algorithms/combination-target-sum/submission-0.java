class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(res, new ArrayList<>(), nums, target, 0);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> current, int[] nums, int target, int i) {
        if (target < 0 || i >= nums.length) return;
        if (target == 0) {
            res.add(new ArrayList<>(current));
            return;
        }
        current.add(nums[i]);
        backtrack(res, current, nums, target - nums[i], i);
        current.remove(current.size() - 1);
        backtrack(res, current, nums, target, i + 1);
    }
}
