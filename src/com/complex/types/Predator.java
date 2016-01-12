package com.complex.types;

import com.complex.util.NumberFunctions;
import static com.complex.constants.Constants.*;

public class Predator extends Agent {


    public Predator(Type type) {
        super.setX(NumberFunctions.generateRandomInt(WIDTH));
        super.setY(NumberFunctions.generateRandomInt(HEIGHT));
        super.setStrength(500);
        super.setType(type);
    }

    @Override
    public String toString() {
        return super.toString() + " type: " + super.getType();
    }

}
