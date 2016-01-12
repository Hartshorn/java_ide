package com.complex.types;


public enum Type {

    HUMAN, DOG, WOLF, FISH;

    @Override
    public String toString() {
        return this.name().toLowerCase();
    }
}
