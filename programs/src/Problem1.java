// Problem: Two Sum (Easy–Medium)

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to the target.

// Example:

// Input: nums = [2, 7, 11, 15], target = 9  
// Output: [0,1]

// Constraints:

// Exactly one solution exists
// You cannot use the same element twice

import java.util.HashMap;

public class Problem1 {
    private static int[] addNum(int[] inputArr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<inputArr.length; i++) {
            int current = inputArr[i];
            int needed = target - current;

            if(map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }
            map.put(current,i);
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] inputArr = {3, 3, 11, 5};
        int target = 6;
        int[] result = addNum(inputArr, target);
        for(int i=0; i<result.length; i++) {
            System.out.println(result[i]);
        }
    }
}