class TypecastingInt {
    public static void main(String[] args) {
        int a = 1000;
        System.out.println("int a: " + a);

        byte b = (byte) a;
        System.out.println("byte b: " + b);

        short c = (short) a;
        System.out.println("short c: " + c);

        char d = (char) a;
        System.out.println("char d: " + d);

        long e = a;
        System.out.println("long e: " + e);

        float f = a;
        System.out.println("float f: " + f);

        double g = a;
        System.out.println("double g: " + g);
    }
}
