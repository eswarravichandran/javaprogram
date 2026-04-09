// 🔹 Problem 2: Maximum Subarray (Kadane’s Algorithm)
// 🧾 Problem Statement

// Given an integer array nums, find the contiguous subarray with the largest sum and return its sum.

// 📌 Example
// Input:  [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6

// Explanation:
// Subarray [4,-1,2,1] → sum = 6
// 🎯 Constraints
// Must be contiguous
// Optimize to O(n)

public class Problem6 {
    private static int maxSubArr(int[] arr) {
        int res = arr[0];
        int currSum = arr[0];

        for(int i=1; i<arr.length; i++) {
            currSum = Math.max(arr[i], currSum + arr[i]);
            res = Math.max(res, currSum);
        }

        return res;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArr(arr));
    }
}