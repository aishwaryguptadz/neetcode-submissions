class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, nums, res, new ArrayList<>());
        return res;
    }

    public void backtrack(int start, int[] nums, List<List<Integer>> res, List<Integer> path) {
        res.add(new ArrayList<>(path));
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrack(i + 1, nums, res, path);
            path.remove(path.size() - 1);
        }
    }
}