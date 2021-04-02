package com.ann.stringproblems;

public class LongestPalindromicSubstring {


    public String longestPalindrome(String s) {
        if(s.length() < 2) {
            return s;
        }
        char[] T = ("$" + s.replaceAll("", "#") + "@").toCharArray();

        int[] P = new int[T.length];
        int center = 0;
        int right = 0;

        for(int i = 1; i < T.length - 1; i++) {
            int mirror = 2*center -i;

            if(i < right)
                P[i] = Math.min(right - i, P[mirror]);


            while(T[i + (1 + P[i])] == T[i - (1 + P[i])])
                P[i]++;

            if (i + P[i] > right) {
                center = i;
                right = i + P [i];
            }
        }

        int length = 0;
        center = 0;
        for(int i = 1; i < P.length-1; i++) {
            if(P[i] > length) {
                length = P[i];
                center = i;
            }
        }

        return s.substring((center - 1 - length) / 2, (center - 1 + length) /2);
    }
}
