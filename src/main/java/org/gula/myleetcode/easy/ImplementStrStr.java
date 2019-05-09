package org.gula.myleetcode.easy;

public class ImplementStrStr {
    public int strStr(String haystack, String needle) {
        char[] haystacks = haystack.toCharArray();
        int n = haystacks.length;
        char[] needles = needle.toCharArray();
        int m = needles.length;
        if (m == 0) {
            return 0;
        }
        int result = -1;
        for (int i = 0, j = 0; i < n && j < m; i++) {
            if (haystacks[i] == needles[j]) {
                if (n - i < m) {
                    result = -1;
                } else {
                    result = i;
                    for (int k = i; k < n && j < m; k++, j++) {
                        if (haystacks[k] != needles[j]) {
                            j = 0;
                            result = -1;
                            break;
                        }
                    }
                    if (result > 0) {
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
