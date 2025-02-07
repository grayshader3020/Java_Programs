class TypecastingFloat {
    public static void main(String[] args) {
        float a = 123.45f;
        System.out.println("float a: " + a);

        byte b = (byte) a;
        System.out.println("byte b: " + b);

        short c = (short) a;
        System.out.println("short c: " + c);

        char d = (char) a;
        System.out.println("char d: " + d);

        int e = (int) a;
        System.out.println("int e: " + e);

        long f = (long) a;
        System.out.println("long f: " + f);

        double g = a;
        System.out.println("double g: " + g);
    }
}
