package edu.brain.lesson_18;

class StringData extends AbstractData {
    private final TypeData type;
    private final String data;

    public <T extends AbstractData & Storable> StringData(long id, TypeData type, T data) {
        super(id);
        this.type = type;
        this.data = data.convertToString();
    }

    @Override
    String convertToString() {
        return toString();
    }

    @Override
    public String toString() {
        return "StringData{" +
                "type=" + type +
                ", data='" + data + '\'' +
                '}';
    }
}
