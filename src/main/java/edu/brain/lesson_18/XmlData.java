package edu.brain.lesson_18;

class XmlData extends AbstractData implements Storable<String> {
    private final TypeData type = TypeData.XML;
    private String data;

    public XmlData(long id) {
        super(id);
    }

    @Override
    String convertToString() {
        return toString();
    }

    @Override
    public String read() {
        return data;
    }

    @Override
    public void write(String data) {
        this.data = data;
    }

    @Override
    public TypeData getType() {
        return type;
    }

    @Override
    public String toString() {
        return "XmlData{" +
                "type=" + type +
                ", data='" + data + '\'' +
                ", id=" + id +
                '}';
    }
}
