package com.complex.types;

import com.complex.util.NumberFunctions;
import static com.complex.constants.Constants.*;

public class Explorer extends Agent {

    private boolean armed;
    private String weapon;

    public Explorer(Type type) {
        super.setX(NumberFunctions.generateRandomInt(WIDTH));
        super.setY(NumberFunctions.generateRandomInt(HEIGHT));
        super.setStrength(100);
        this.armed = false;
        this.weapon = "";
        super.setType(type);
    }

    public boolean isArmed() {
        return armed;
    }

    public void setArmed(boolean armed) {
        this.armed = armed;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String toString() {
        return super.toString() + " type: " + super.getType();
    }
}
