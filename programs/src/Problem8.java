// 🔹 Problem 2: Move Zeroes
// 🧾 Problem Statement

// Given an array nums, move all 0s to the end without changing the order of non-zero elements.

// 👉 Do it in-place

// 📌 Example
// Input:  [0,1,0,3,12]
// Output: [1,3,12,0,0]
// 🎯 Constraints
// No extra array (O(1) space preferred)
// Maintain order

public class Problem8 {
    private static int[] moveZeros(int[] arr) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }
        while (count < arr.length) {
            arr[count++] = 0;
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        int[] res = moveZeros(arr);
        for(int i=0; i<res.length; i++) {
            System.out.println(res[i]);
        }
    }
}
