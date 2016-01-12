package com.complex.main;

import com.complex.types.Agent;
import com.complex.util.AgentFunctions;
import com.complex.util.DrawingFunctions;
import com.complex.util.NumberFunctions;

import java.util.List;
import java.util.Scanner;

public class ComplexDriver {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Agent> agents = AgentFunctions.initAgents();
        Boolean[] plants = AgentFunctions.initPlants();

        int input = scanner.nextInt();

        while(input != 999) {
            DrawingFunctions.clearScreen();

            agents.forEach((a) -> {
                int index = NumberFunctions.getIndex(a.getX(), a.getY());
                a.move(1,1);
                a.turn();
                if (plants[index]) {
                    a.eat();
                    plants[index] = false;
                }
                DrawingFunctions.drawAgent(a);
            });
            DrawingFunctions.resetCursor();
            input = scanner.nextInt();
        }
    }
}
