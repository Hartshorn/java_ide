package com.complex.util;

import com.complex.types.Agent;

import static com.complex.constants.Constants.*;

public class DrawingFunctions {

    public static void drawAgent(Agent a) {

        moveCursor(a.getX(), a.getY());

        switch (a.getType()) {
            case HUMAN:
                System.out.print(GREEN + "M" + RESET);
                break;
            case WOLF:
                System.out.print(RED + "P" + RESET);
        }
    }

    private static void moveCursor(int x, int y) {
        String position = ESC + "[" + x + ";" + y + "f";
        System.out.print(position);
    }

    public static void resetCursor() {
        String position = ESC + "[" + HEIGHT + ";0f";
        System.out.print(position);
    }

    public static void clearScreen() {
        String position = ESC + "[2J";
        System.out.print(position);
    }

}
