class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character, Integer> count = new HashMap<>();
        int res = 0;

        int l = 0, maxF = 0;
        for (int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            count.put(c, count.getOrDefault(c, 0) + 1);
            maxF = Math.max(maxF, count.get(c));

            while ((r - l + 1) - maxF > k) {
                char lc = s.charAt(l);
                count.put(lc, count.get(lc) - 1);
                l++;
            }
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
