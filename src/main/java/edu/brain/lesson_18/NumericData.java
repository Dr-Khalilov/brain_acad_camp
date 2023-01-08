package edu.brain.lesson_18;

class NumericData extends AbstractData implements Storable<Number> {
    private final TypeData type = TypeData.NUM;
    private Number data;

    public NumericData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return toString();
    }

    @Override
    public Number read() {
        return data;
    }

    @Override
    public void write(Number data) {
        this.data = data;
    }

    @Override
    public TypeData getType() {
        return type;
    }

    @Override
    public String toString() {
        return "NumericData{" +
                "type=" + type +
                ", data=" + data +
                ", id=" + id +
                '}';
    }
}
