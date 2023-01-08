package edu.brain.lesson18;

class Main {
    public static void main(String[] args) {
        /**
         * Convert byte array to Byte wrapper array
         */
        byte[] binary = "Данные в байтах".getBytes();
        Byte[] bytes = DocumentProcessorUtil.toObjects(binary);


        Storable[] store = {
                new XmlData(++DocumentProcessorUtil.ID_COUNTER),
                new BinaryData(++DocumentProcessorUtil.ID_COUNTER),
                new NumericData(++DocumentProcessorUtil.ID_COUNTER),
        };

        Object[] data = {"<?xml version=\"1.0\"?><Tests>qwerty</Tests>", bytes, Double.MAX_VALUE};

        for (int i = 0; i < store.length; i++) {
            DocumentProcessorUtil.build(store[i], data[i]);
            if (store[i] instanceof XmlData) {
                System.out.println(DocumentProcessorUtil.convert((XmlData) store[i]));
            }
            if (store[i] instanceof BinaryData) {
                System.out.println(DocumentProcessorUtil.convert((BinaryData) store[i]));
            }
            if (store[i] instanceof NumericData) {
                System.out.println(DocumentProcessorUtil.convert((NumericData) store[i]));
            }
        }
    }
}
