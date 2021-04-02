package com.ann.stringproblems;

public class ZigZagConversion {

    public String convert(String s, int numRows) {
        if(s.length() <= numRows) {
            return s;
        }
        int n = s.length();
        int numCol = 0;
        while (n > 0) {
            int t = Math.min(n, numRows);
            numCol++;
            n -=t;

            if(n < 1) break;
            t = Math.min(n, numRows%2==0 ? numRows/2 : (numRows/2) + 1);
            numCol += t;
            n -= t;
        }

        char[] res = new char[s.length()];
        res[0] = s.charAt(0);
        int currRow = 1;
        int j = 0;
        boolean goingDown = true;
        for (int i = 1; i < s.length(); i++) {
            if(goingDown) {
                if(currRow < numRows) {
                }
                res[i] = s.charAt(i);
            }
        }


    }
}
