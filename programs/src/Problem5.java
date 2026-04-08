// 🔹 Problem 1: Valid Anagram
// 🧾 Problem Statement

// Given two strings s and t, return true if t is an anagram of s, otherwise return false.

// 👉 An anagram means:

// Same characters
// Same frequency
// Order doesn’t matter
// 📌 Example
// Input:  s = "anagram", t = "nagaram"
// Output: true

// Input:  s = "rat", t = "car"
// Output: false
// 🎯 Constraints
// Strings contain only lowercase letters (assume for now)
// Optimize for time

import java.util.HashMap;
import java.util.Map;

public class Problem5 {
    private static boolean isAnagram(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<>();

        if(s1.length() != s2.length()) {
            return false;
        }
        else {
            for(int i=0; i<s1.length(); i++) {
                if(map.containsKey(s1.charAt(i))) {
                    map.put(s1.charAt(i), map.get(s1.charAt(i))+1);
                }
                else {
                    map.put(s1.charAt(i), 1);
                }
            }
            for(int i=0; i<s2.length(); i++) {
                if(map.containsKey(s2.charAt(i))) {
                    map.put(s2.charAt(i), map.get(s2.charAt(i))-1);
                }
                else {
                    return false;
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if(entry.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "anagram";
        String s2 = "nagaram";

        System.out.println(isAnagram(s1, s2));
    }
}