// 🔹 Problem: Longest Substring Without Repeating Characters
// 🧾 Problem Statement

// Given a string s, find the length of the longest substring without repeating characters.

// 📌 Example
// Input:  "abcabcbb"
// Output: 3

// Explanation:
// "abc" is the longest substring without repeating characters
// 🎯 Constraints
// Substring must be continuous
// Characters should be unique

import java.util.HashSet;

public class Problem7 {

    static int longestStr(String str) {
        int res = 0;
        int startIndex = 0;

        HashSet<Character> ch = new HashSet<>();
        
        for(int i=0; i<str.length(); i++) {
            while(ch.contains(str.charAt(i))) {
                ch.remove(str.charAt(startIndex));
                startIndex++;
            }
            ch.add(str.charAt(i));
            res = Math.max(res, i - startIndex + 1);
        }
        return res;
    }

    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestStr(str));
    }
}