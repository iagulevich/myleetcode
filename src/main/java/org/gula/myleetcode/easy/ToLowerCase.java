package org.gula.myleetcode.easy;

public class ToLowerCase {

    public String toLowerCase(String str) {
        int firstUpper = (int) 'A' - 1;
        int firstLower = (int) 'a' - 1;
        int diff = firstLower - firstUpper;
        StringBuilder sb = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if ((int) ch >= firstUpper && (int) ch <= firstUpper + 26) {
                sb.append((char) ((int) ch + diff));
            } else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
