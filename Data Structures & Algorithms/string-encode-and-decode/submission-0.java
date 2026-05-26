class Solution {
        
    public String encode(List<String> strs) {
        StringBuilder res = new StringBuilder();
        for (String s : strs) {
            res.append(s.length()).append(";").append(s);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != ';') {
                j++;
            }
            int l = Integer.parseInt(str.substring(i, j));
            j++;
            String word = str.substring(j, j + l);
            res.add(word);
            i = j + l;
        }
        return res;
    }
}
