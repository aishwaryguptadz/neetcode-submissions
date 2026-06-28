public class Solution {
    public int characterReplacement(String s, int k) {
        int res = 0;
        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (char ch : set) {
            int c = 0, l = 0;
            for (int r = 0; r < s.length(); r++) {
                if (s.charAt(r) == ch) {
                    c++;
                }

                while ((r - l + 1) - c > k) {
                    if (s.charAt(l) == ch) {
                        c--;
                    }
                    l++;
                }

                res = Math.max(res, r - l + 1);
            }
        }
        return res;
    }
}