package com.complex.constants;


public final class Constants {

//    public static final int WIDTH = 56;
//    public static final int HEIGHT = 193;
    public static final int WIDTH = 10;
    public static final int HEIGHT = 10;
    public static final double AGENT_FACTOR = 0.05;
    public static final double PLANT_FACTOR = 0.3;

    public static final int MAX_INIT = WIDTH * HEIGHT;
    public static final double MAX_AGENTS = MAX_INIT * AGENT_FACTOR;
    public static final double MAX_PLANTS = MAX_INIT * PLANT_FACTOR;

    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static final String ESC = "\u001B";


}
