package edu.brain.lesson_18;

interface Storable<S> {
    S read();

    void write(S data);

    TypeData getType();
}
