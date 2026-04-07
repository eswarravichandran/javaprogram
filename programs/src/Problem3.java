// Problem 3: Best Time to Buy and Sell Stock
// 🧾 Problem Statement

// You are given an array prices[] where prices[i] is the stock price on day i.

// 👉 Find the maximum profit you can achieve by:

// Buying on one day
// Selling on a later day

// If no profit is possible, return 0.

// Input:  [7,1,5,3,6,4]
// Output: 5

// Explanation:
// Buy at 1, Sell at 6 → Profit = 5

import java.util.Scanner;

public class Problem3 {
    static int findProfit(int[] arr) {
        int min = arr[0];
        int maxProfit = 0;

        for(int i = 1; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            } else {
                int profit = arr[i] - min;
                if(profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();sc.nextLine();
        int[] arr = new int[len];
        for(int i=0; i<len; i++) {
            arr[i] = sc.nextInt(); sc.nextLine();
        }
        System.out.println(findProfit(arr));
        sc.close();
    }
}