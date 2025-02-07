class TypecastingDouble {
    public static void main(String[] args) {
        double a = 456.78;
        System.out.println("double a: " + a);

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

        float g = (float) a;
        System.out.println("float g: " + g);
    }
}
