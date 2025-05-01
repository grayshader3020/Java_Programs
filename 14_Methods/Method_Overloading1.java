public class Method_Overloading1 {
    public static void main(String[] args) {
        add(1, 2);
        add(1.2,1.2);
        add('a','b');
        add("amazing","Spiderman");
    }
    public static void add(int a, int b) {
        System.out.println(a + b);
    }
    public static void add(double a, double b) {
        System.out.println(a + b);
    }
    public static void add(char a, char b) {
        System.out.println(a + b);
    }
    public static void add(String a, String b) {
        System.out.println(a + b);
    }
}
