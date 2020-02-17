package ru.job4j.array;

public class MonoVertical {
    public static boolean monoVertical(char[][] board, int column) {
        boolean result = false;
        for (int i=0;i<board.length;i++) {
            if (board[i][column]=='X') {
                result = true;
            }
            else break;
        }
        return result;
    }
}
