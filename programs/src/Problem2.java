// Problem 2: Valid Parentheses (Medium)

// Given a string s containing just '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

// A string is valid if:

// Open brackets are closed by the same type
// Open brackets are closed in the correct order

// Example:

// Input: s = "()[]{}"  
// Output: true
// Input: s = "(]"  
// Output: false

import java.util.Scanner;
import java.util.Stack;

public class Problem2 {
    static boolean checkParen(String str) {
        Stack<Character> paren = new Stack<Character>();
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '(' || str.charAt(i) == '[' || str.charAt(i) == '{'){
                paren.push(str.charAt(i));
            }
            else {
                if(!paren.isEmpty()) {
                    char top = paren.pop();
                    if(!((top == '(' && str.charAt(i) == ')') || (top == '[' && str.charAt(i) == ']') || (top == '{' && str.charAt(i) == '}'))) {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        if(paren.size() > 0) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(checkParen(str));
        sc.close();
    }
}