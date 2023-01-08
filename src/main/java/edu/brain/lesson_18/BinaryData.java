package edu.brain.lesson_18;

import java.util.Arrays;

class BinaryData extends AbstractData implements Storable<Byte[]> {
    private final TypeData type = TypeData.BIN;
    private Byte[] data;

    public BinaryData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return toString();
    }

    @Override
    public Byte[] read() {
        return data;
    }

    @Override
    public void write(Byte[] data) {
        this.data = data;
    }

    @Override
    public TypeData getType() {
        return type;
    }

    @Override
    public String toString() {
        return "BinaryData{" +
                "type=" + type +
                ", data=" + Arrays.toString(data) +
                ", id=" + id +
                '}';
    }
}
