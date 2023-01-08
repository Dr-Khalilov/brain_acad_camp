package edu.brain.lesson18;

interface Storable<S> {
    S read();

    void write(S data);

    TypeData getType();
}
