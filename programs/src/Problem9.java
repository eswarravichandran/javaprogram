// 🧾 Problem Statement

// You are given:

// A string s consisting of uppercase English letters
// An integer k

// 👉 You can perform at most k operations

// In one operation:

// You can replace any character in the string with any other uppercase letter
// 🎯 Goal

// Return the length of the longest substring that can be made of same characters after performing at most k replacements.

// 📌 Example 1
// Input:  s = "ABAB", k = 2
// Output: 4

// Explanation:
// Replace 2 characters → "AAAA" or "BBBB"
// 📌 Example 2
// Input:  s = "AABABBA", k = 1
// Output: 4

// Explanation:
// One optimal substring: "AABA"

import java.util.HashMap;
import java.util.Map;

public class Problem9 {
    static int characterReplacement(String s, int k) {
        int maxLength = 0;
        int maxCount = 0;
        int start = 0;
        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char iChar = s.charAt(i);
            countMap.put(iChar, countMap.getOrDefault(iChar, 0) + 1);
            maxCount = Math.max(maxCount, countMap.get(iChar));

            if (i - start + 1 - maxCount > k) {
                char startChar = s.charAt(start);
                countMap.put(startChar, countMap.get(startChar) - 1);
                start++;
            }

            maxLength = Math.max(maxLength, i - start + 1);
        }

        return maxLength;
    }
    public static void main(String[] args) {
        String str = "AABABBAB";
        int k = 1;
        System.out.println(characterReplacement(str, k));  
    }
}