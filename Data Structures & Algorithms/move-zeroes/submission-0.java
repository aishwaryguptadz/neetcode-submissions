class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer> inter = new ArrayList<>();
        for (int i : nums) {
            if (i != 0) inter.add(i);
        }
        while (inter.size() != nums.length) inter.add(0);
        for (int i = 0; i < nums.length; i++) nums[i] = inter.get(i);
    }
}