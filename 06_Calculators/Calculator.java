import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        float num1 = sc.nextFloat();
        System.out.println("Enter num2: ");
        float num2 = sc.nextFloat();
        System.out.println("Enter Operator");
        char opr = sc.next().charAt(0);
        float ans= 0;
        ans = (opr == '+')? num1+num2:
                (opr == '-')? num1-num2:
                (opr == '*')? num1*num2:
                (opr == '/')? num1/num2:
                (opr == '%')? num1%num2:(0.000001f);

        String output  = num1 +" "+opr+" "+num2+" = "+ans;
        if (!(ans ==0.000001f)){
            System.out.println(output);
        }

    }
}
