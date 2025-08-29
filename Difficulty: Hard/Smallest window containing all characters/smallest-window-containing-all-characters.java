import java.util.*;

class Solution {
    public static String smallestWindow(String s, String p) {
        if (s.length() < p.length()) return "";

        Map<Character, Integer> targetFreq = new HashMap<>();
        for (char ch : p.toCharArray()) {
            targetFreq.put(ch, targetFreq.getOrDefault(ch, 0) + 1);
        }

        int start = 0, minLen = Integer.MAX_VALUE, minStart = 0;
        int matched = 0;
        Map<Character, Integer> windowFreq = new HashMap<>();

        for (int end = 0; end < s.length(); end++) {
            char endChar = s.charAt(end);
            windowFreq.put(endChar, windowFreq.getOrDefault(endChar, 0) + 1);

            if (targetFreq.containsKey(endChar) &&
                windowFreq.get(endChar).intValue() <= targetFreq.get(endChar).intValue()) {
                matched++;
            }

            while (matched == p.length()) {
                if (end - start + 1 < minLen) {
                    minLen = end - start + 1;
                    minStart = start;
                }

                char startChar = s.charAt(start);
                windowFreq.put(startChar, windowFreq.get(startChar) - 1);
                if (targetFreq.containsKey(startChar) &&
                    windowFreq.get(startChar).intValue() < targetFreq.get(startChar).intValue()) {
                    matched--;
                }
                start++;
            }
        }

        return minLen == Integer.MAX_VALUE ? "" : s.substring(minStart, minStart + minLen);
    }
}