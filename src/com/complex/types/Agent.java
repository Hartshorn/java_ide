package com.complex.types;
import static com.complex.constants.Constants.*;


public abstract class Agent {

    private int x;
    private int y;
    private int energy = 200;
    private int direction;
    private int strength;
    private Type type;

    public void move(int dx, int dy) {
        this.x = (this.x + dx) % WIDTH;
        this.y = (this.y + dy) % HEIGHT;
    }

    public void turn() {
        this.direction = (this.direction + 1) % 7;
    }

    public void eat() {
        this.energy += 10;
    }

    @Override
    public String toString() {
        return "Agent at: " + this.x + "," + this.y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {

        this.energy = energy;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
