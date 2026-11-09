class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> mp = new HashSet<>();
        int l = 0, res = 0;

        for (int r = 0; r < s.length(); r++) {
            while(mp.contains(s.charAt(r))) {
                mp.remove(s.charAt(l));
                l++;
            }
            mp.add(s.charAt(r));
            res = Math.max(res, r - l + 1);
        }

        return res;
    }
}
