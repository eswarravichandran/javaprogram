// 🧾 Problem Statement

// Given two strings s and t, return the minimum window substring of s such that every character in t (including duplicates) is included.

// If no such substring exists, return "".

// 📌 Example
// Input:  s = "ADOBECODEBANC", t = "ABC"
// Output: "BANC"

import java.util.HashMap;
import java.util.Map;

public class Problem10 {
    static String minWindow(String s, String t) {        
        if (s.length() < t.length()) return "";
        Map<Character, Integer> targetMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            targetMap.put(c, targetMap.getOrDefault(c, 0) + 1);
        }
        int required = targetMap.size();
        int formed = 0;
        Map<Character, Integer> windowMap = new HashMap<>();
        int left = 0, right = 0;
        int minLen = Integer.MAX_VALUE;
        int startIndex = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
            if (targetMap.containsKey(c) &&
                windowMap.get(c).intValue() == targetMap.get(c).intValue()) {
                formed++;
            }
            while (left <= right && formed == required) {
                if ((right - left + 1) < minLen) {
                    minLen = right - left + 1;
                    startIndex = left;
                }
                char leftChar = s.charAt(left);
                windowMap.put(leftChar, windowMap.get(leftChar) - 1);
                if (targetMap.containsKey(leftChar) &&
                    windowMap.get(leftChar) < targetMap.get(leftChar)) {
                    formed--;
                }
                left++;
            }
            right++;
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(startIndex, startIndex + minLen);
    }
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }
}