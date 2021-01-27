package com.leetcode;

import java.util.Arrays;

/**
 * @Author yxx
 * @Date 2021/1/26 20:22
 */
public class 等价多米诺骨牌对的数量 {

    public static int numEquivDominoPairs(int[][] dominoes) {

        int ans = 0;
        int[] cp = new int[100];
        for (int[] arr : dominoes) {
            Arrays.sort(arr);
            int x= cp[arr[0] * 10 + arr[1]]++;
            ans=ans+x;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] xx = new int[][]{{1, 2}, {2, 1}, {3, 0}, {0, 3}};
        int i = numEquivDominoPairs(xx);
        System.out.println(i);
    }

}
