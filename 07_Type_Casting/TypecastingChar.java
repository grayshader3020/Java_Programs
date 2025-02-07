class TypecastingChar {
    public static void main(String[] args) {
        char a = 'A';
        System.out.println("char a: " + a);

        short b = (short) a;
        System.out.println("short b: " + b);

        int c = a;
        System.out.println("int c: " + c);

        long d = a;
        System.out.println("long d: " + d);

        float e = a;
        System.out.println("float e: " + e);

        double f = a;
        System.out.println("double f: " + f);
    }
}
