package ru.job4j.condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
        int rsl = 0;

        if (x1 == y2 || y1 == x2) {
            rsl = Math.abs(y2 - y1);
            rsl = rsl == 0 ? Math.abs(x2 - x1) : rsl;
        }

        return rsl;
    }
}
