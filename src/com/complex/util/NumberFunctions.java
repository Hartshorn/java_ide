package com.complex.util;


import com.complex.constants.Constants;

import java.util.Random;

public class NumberFunctions {

    private static Random rand = new Random();

    public static Integer generateRandomInt(Integer max) {
        return Math.abs(rand.nextInt() % max);
    }

    public static Boolean generateRandomBool() {
        return rand.nextBoolean();
    }

    public static int getIndex(int x, int y) {
        return (y * Constants.WIDTH + x) % Constants.MAX_INIT;
    }
}
