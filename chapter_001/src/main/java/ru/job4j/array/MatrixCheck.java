package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int j=0;j<board.length;j++) {
            if (board[row][j]!='X' ) {
                result = false;
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
    public static boolean isWin(char[][] board) {
        boolean result = false;
        for ( int index=0;index<board.length;index++ ) {
            if ( (monoHorizontal(board, index) || MonoVertical.monoVertical(board, index)) ) {
                result = true;
                break;
            }
            else result=false;
        }
        return result;
    }
}