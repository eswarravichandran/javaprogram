// Problem: Longest Substring with At Most K Distinct Characters
// 🧾 Problem Statement

// Given a string s and an integer k, return the length of the longest substring that contains at most k distinct characters.

// 📌 Example
// Input: s = "eceba", k = 2  
// Output: 3  
// Explanation: "ece"

import java.util.HashMap;

public class Problem11 {
    static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int res = 0;
        HashMap<Character, Integer> wMap = new HashMap<>();
        int left = 0;

        for(int right=0; right<s.length(); right++) {
            wMap.put(s.charAt(right), wMap.getOrDefault(wMap.get(s.charAt(right)), 0) + 1);
            while(wMap.size() > k) {
                wMap.put(s.charAt(left), wMap.get(s.charAt(left)) - 1);
                if(wMap.get(s.charAt(left)) == 0) {
                    wMap.remove(s.charAt(left));
                }
                ++left;
            }
            res = Math.max(res, right - left + 1);
        }

        return res;
    }
    public static void main(String[] args) {
        String str = "eceba";
        int k = 2;

        System.out.println(lengthOfLongestSubstringKDistinct(str, k));
    }
}