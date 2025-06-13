package xyz;

import java.util.HashSet;

public class LongestSubStringWoRepeating {
    public static void main(String[] args) {
        String s = "Vishnu Vardhan";

        int maxLength = lengthOfLongestSubstring(s);

        System.out.println("Length of Longest Substring Without Repeating Characters: " + maxLength);
    }

    public static int lengthOfLongestSubstring(String s) {
        int left = 0, right = 0, maxLen = 0;
        HashSet<Character> set = new HashSet<>();

        while (right < s.length()) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}

