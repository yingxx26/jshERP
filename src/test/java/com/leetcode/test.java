package com.leetcode;

import java.util.Arrays;

/**
 * @Author yxx
 * @Date 2021/1/26 20:22
 */
public class test {

    public static int numEquivDominoPairs(int[][] dominoes) {

        int ans = 0;
        int[] cp = new int[100];
        for (int[] arr : dominoes) {
            Arrays.sort(arr);
            ans += cp[arr[0] * 10 + arr[1]]++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] xx = new int[][]{{1, 2}, {2, 1}, {3, 4}, {5, 6}};
        int i = numEquivDominoPairs(xx);
        System.out.println(i);
    }

}
