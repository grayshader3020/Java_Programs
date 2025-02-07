class TypecastingLong {
    public static void main(String[] args) {
        long a = 10000L;
        System.out.println("long a: " + a);

        byte b = (byte) a;
        System.out.println("byte b: " + b);

        short c = (short) a;
        System.out.println("short c: " + c);

        char d = (char) a;
        System.out.println("char d: " + d);

        int e = (int) a;
        System.out.println("int e: " + e);

        float f = a;
        System.out.println("float f: " + f);

        double g = a;
        System.out.println("double g: " + g);
    }
}
