// 🧾 Problem Statement

// Given an integer array nums and an integer k, return the total number of subarrays whose sum equals to k.

// 📌 Example
// Input: nums = [1,1,1], k = 2  
// Output: 2

import java.util.HashMap;

public class Problem12 {
    static int subarraySum(int[] nums, int k) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int currSum = 0;

        map.put(0, 1); // base case

        for(int i=0; i<nums.length; i++) {
            currSum += nums[i];

            if(map.containsKey(currSum - k)) {
                count += map.get(currSum - k);
            }

            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);

        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1};
        int target = 2;
        System.out.println(subarraySum(arr, target));
    }
}