package com.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Author yxx
 * @Date 2021/1/26 20:22
 */
public class 有效的括号1 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        char[] xx = s.toCharArray();
        for (char x : xx) {
            if (x == '(') stack.push(')');
            else if (x == '{') stack.push('}');
            else if (x == '[') stack.push(']');
            else if (stack.isEmpty() || x != stack.pop()) return false;
        }
        return true;

    }

    public static void main(String[] args) {
        String xx = "{[[()]]}";
        boolean valid = isValid(xx);
        System.out.println(valid);
    }

}
