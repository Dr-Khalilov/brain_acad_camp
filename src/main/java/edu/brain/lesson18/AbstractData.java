package edu.brain.lesson18;

abstract class AbstractData {
    protected long id;

    public AbstractData(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    abstract String convertToString();
}
