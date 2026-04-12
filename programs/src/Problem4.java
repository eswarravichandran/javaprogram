// Problem: Contains Duplicate
// 🧾 Problem Statement

// Given an integer array nums, return true if any value appears at least twice, otherwise return false.

// 📌 Example
// Input:  [1,2,3,1]
// Output: true

// Input:  [1,2,3,4]
// Output: false
// 🎯 Constraints
// Optimize for time complexity

import java.util.HashSet;

public class Problem4 {
    static boolean containsDuplicate(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr.length; i++) {
            if(set.contains(arr[i])) {
                return true;
            }
            set.add(arr[i]);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0};
        System.out.println(containsDuplicate(arr));
    }
}