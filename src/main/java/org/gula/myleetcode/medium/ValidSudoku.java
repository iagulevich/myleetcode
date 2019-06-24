package org.gula.myleetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ValidSudoku {

    private static final List<Character> DIGITS = Arrays.asList('1', '2', '3', '4', '5', '6', '7', '8', '9');
    private static final int N = 9;

    public boolean isValidSudoku(char[][] board) {
        return isValidRow(board) && isValidColumn(board) && isValidSubBox(board);
    }

    private boolean isValidSubBox(char[][] board) {
        Set<Character> set;
        for (int s1 = 0, e1 = 3; e1 <= N; s1 += 3, e1 += 3) {
            for (int s2 = 0, e2 = 3; e2 <= N; s2 += 3, e2 += 3) {
                set = new HashSet<>(9);
                for (int i = s1; i < e1; i++) {
                    for (int j = s2; j < e2; j++) {
                        char ch = board[i][j];
                        if (ch == '.') {
                            continue;
                        }
                        if (!DIGITS.contains(ch) || !set.add(ch)) {
                            System.out.println("isValidSubBox, ch:" + ch);
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    private boolean isValidColumn(char[][] board) {
        Set<Character> set;
        for (int i = 0; i < N; i++) {
            set = new HashSet<>(N);
            for (int j = 0; j < N; j++) {
                char ch = board[j][i];
                if (ch == '.') {
                    continue;
                }
                if (!DIGITS.contains(ch) || !set.add(ch)) {
                    System.out.println("isValidColumn, ch:" + ch);
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidRow(char[][] board) {
        Set<Character> set;
        for (int i = 0; i < N; i++) {
            set = new HashSet<>(N);
            for (int j = 0; j < N; j++) {
                char ch = board[i][j];
                if (ch == '.') {
                    continue;
                }
                if (!DIGITS.contains(ch) || !set.add(ch)) {
                    System.out.println("isValidRow, ch:" + ch);
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        char[][] chars = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}, {'6', '.', '.', '1', '9', '5', '.', '.', '.'}, {'.', '9', '8', '.', '.', '.', '.', '6', '.'}, {'8', '.', '.', '.', '6', '.', '.', '.', '3'}, {'4', '.', '.', '8', '.', '3', '.', '.', '1'}, {'7', '.', '.', '.', '2', '.', '.', '.', '6'}, {'.', '6', '.', '.', '.', '.', '2', '8', '.'}, {'.', '.', '.', '4', '1', '9', '.', '.', '5'}, {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
        boolean validSudoku = new ValidSudoku().isValidSudoku(chars);
        System.out.println(validSudoku);
    }
}
