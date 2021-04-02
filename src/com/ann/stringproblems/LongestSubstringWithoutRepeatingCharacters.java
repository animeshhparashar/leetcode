package com.ann.stringproblems;

import java.util.LinkedList;
import java.util.Queue;

public class LongestSubstringWithoutRepeatingCharacters {

    public int lengthOfLongestSubstring(String s) {
        Queue<Character> qu = new LinkedList<>();
        int maxLength = 0;
        if(s.isEmpty()) {
            return 0;
        }
        for (Character ch :
                s.toCharArray()) {
            if(qu.contains(ch)) {
                while(qu.remove()!= ch);
                qu.add(ch);
            }
            else {
                qu.add(ch);
            }
            maxLength = Math.max(qu.size(), maxLength);
        }

        return maxLength;
    }
}
