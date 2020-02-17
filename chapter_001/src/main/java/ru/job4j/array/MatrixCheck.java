package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j=0;j<board.length;j++) {
            if (board[row][j]=='X' ) {
                result = true;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for ( int j=0;j<board.length;j++ ) {
            rsl[j] = board[j][j];
        }
        return rsl;
    }
}