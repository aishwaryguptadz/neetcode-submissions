class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        String str;
        for (String s : strs) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            str = new String(ch);
            map.putIfAbsent(str, new ArrayList<>());
            map.get(str).add(s);
        }
        return new ArrayList<>(map.values());
    }
}
