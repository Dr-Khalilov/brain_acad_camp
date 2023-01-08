package edu.brain.lesson10;

class Wrapper {
    public static void main(String[] args) {
        Byte b1 = 10;
        Byte b2 = Byte.valueOf((byte) 12);
        Byte b3 = new Byte((byte) 11);
        Byte b4 = Byte.parseByte("111");

        Short s1 = 10;
        Short s2 = Short.valueOf((short) 150);
        Short s3 = new Short((short) 161);
        Short s4 = Short.parseShort("244");

        Integer i1 = 19999;
        Integer i2 = Integer.valueOf(2000);
        Integer i3 = new Integer(30000);
        Integer i4 = Integer.parseInt("400000");

        Long l1 = 500000L;
        Long l2 = Long.valueOf(4000000);
        Long l3 = new Long(34434343);
        Long l4 = Long.parseLong("434242323");

        Float f1 = 23.2321f;
        Float f2 = Float.valueOf(242.23f);
        Float f3 = new Float(2.23f);
        Float f4 = Float.parseFloat("32.3");

        Double d1 = 342.424;
        Double d2 = Double.valueOf(332.31);
        Double d3 = new Double(233.5);
        Double d4 = Double.parseDouble("24.311");

        Character c1 = 332;
        Character c2 = Character.valueOf((char) 224);
        Character c3 = new Character((char) 100);
        Character c4 = Character.valueOf('R');

        Boolean bool1 = false;
        Boolean bool2 = Boolean.valueOf(true);
        Boolean bool3 = new Boolean(false);
        Boolean bool4 = Boolean.parseBoolean("true");

        String str1 = "abc";
        String str2 = String.valueOf("abc2");
        String str3 = new String("abcdf");

        Double value = 100.2;

        byte num1 = 100;
        short num2 = 1000;
        int num3 = 100000;
        long num4 = 1000000;
        float num5 = 120.3f;

        Double num6 = (double) num1;
        Double num7 = (double) num2;
        Double num8 = (double) num3;
        Double num9 = (double) num4;
        Double num10 = Double.valueOf(num5);

        Double n1 = 111.1;
        Double n2 = 0.0;

        Double infinityValue = n1 / n2;
        Double nanValue = n2 / n2;

        System.out.println(nanValue); // NaN
        System.out.println(infinityValue); // Infinity
        Wrapper wrap = new Wrapper();
        wrap.isNaNOrInfinity(0.0 / 0.0); // NaN
        wrap.isNaNOrInfinity(20.2 / 0.0); // Infinity

        Long longer1 = 120L;
        Long longer2 = 120L;
        System.out.println(longer1 == longer2); // true

        longer1 = 1200L;
        longer2 = 1200L;
        System.out.println(longer1 == longer2); //false

    }

    void isNaNOrInfinity(double number) {
        if (Double.isNaN(number)) {
            System.out.println("Переменная {{number}} = NaN");
        }
        if (Double.isInfinite(number)) {
            System.out.println("Переменная {{number}} = Infinity");
        }
    }
}
