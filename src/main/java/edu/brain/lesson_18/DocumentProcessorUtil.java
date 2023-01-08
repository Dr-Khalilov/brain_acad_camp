package edu.brain.lesson_18;

import java.util.Arrays;

class DocumentProcessorUtil {
    static long ID_COUNTER;

    private DocumentProcessorUtil() {
    }

    static <T extends AbstractData & Storable> StringData convert(T data) {
        return new StringData(ID_COUNTER++, data.getType(), data);
    }

    static <T> void build(Storable store, T data) {
        store.write(data);
    }

   static Byte[] toObjects(byte[] bytesPrim) {
        Byte[] bytes = new Byte[bytesPrim.length];
        Arrays.setAll(bytes, number -> bytesPrim[number]);
        return bytes;
    }
}
