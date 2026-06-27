class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0, l = 0, r = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();
        for (; r < ch.length; r++) {
            int i = map.getOrDefault(ch[r], -1);
            if (i != -1 && i >= l) {
                res = Math.max(res, r - l);
                l = i + 1;
            }
            map.put(ch[r], r);
        }
        return Math.max(res, r - l);
    }
}
