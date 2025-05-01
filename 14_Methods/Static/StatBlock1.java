package Static;

public class StatBlock1 {
    static{
        System.out.println("From Static block");
    }

    public static void main(String[] args) {
        System.out.println("From main");
        Demo d1 = new Demo();
        d1.property2 ="whatever";
        System.out.println(d1.property2);
    }
}

class Demo{
    int property1;
    String property2;

    public void display()
    {
        System.out.println("display method");
    }
    public Demo()
    {
        System.out.println("From constructor");
    }
}
