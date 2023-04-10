class Solution {
    public int longestPalindrome(String s) {
		Set<Character> set = new HashSet<>();
		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			if (set.contains(s.charAt(i))) {
				set.remove(s.charAt(i));
				count++;
			} else set.add(s.charAt(i));
		}

		int res = count * 2;
		if (res < s.length()) return res + 1;

		return res;
	}
}
