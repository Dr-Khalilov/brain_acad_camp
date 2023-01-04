package edu.brain.lesson_5;

class Body {
    private String type;
    private String colour;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Body{" +
                "type='" + type + '\'' +
                ", colour='" + colour + '\'' +
                '}';
    }
}
