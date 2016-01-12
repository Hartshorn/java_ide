package com.complex.util;


import com.complex.types.Agent;
import com.complex.types.Explorer;
import com.complex.types.Predator;
import com.complex.types.Type;

import static com.complex.constants.Constants.*;

import java.util.ArrayList;
import java.util.List;

public class AgentFunctions {

    public static List<Agent> initAgents() {
        List<Agent> agents = new ArrayList<>();

        for (int i = 0; i < MAX_AGENTS; i++) {
            agents.add(new Explorer(Type.HUMAN));
            agents.add(new Predator(Type.WOLF));
        }

        return agents;
    }

    public static Boolean[] initPlants() {
        Boolean[] plants = new Boolean[MAX_INIT];

        for (int i = 0; i < MAX_INIT; i++) {
            plants[i] = false;
        }

        for (int i = 0; i < MAX_PLANTS; i++) {
            plants[NumberFunctions.generateRandomInt(MAX_INIT)] = true;
        }

        return plants;
    }
}
