import java.util.Scanner;

class Mockprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range end limit :");
        int range = sc.nextInt();
        for (int k = 1; k <= range; k++) {
            int num = k;
            boolean flag = true;
            if (num < 2)
                flag = false;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                int prime = num;
                boolean flag1 = true;
                if (prime > 9) {
                    outerloop:
                        for (int i = prime; i > 0; i /= 10) {
                            int dgt = i % 10;
                            if (dgt < 2) {
                                flag1 = false;
                                break outerloop;
                            }
                            for (int m = 2; m < dgt; m++) {
                                if (dgt % m == 0) {
                                    flag1 = false;
                                    break outerloop;
                                }
                            }

                        }
                }
                if (flag1) {
                    System.out.print(prime + " ");
                } else {
                    System.out.print(prime + " ");
                }

            }


        }

    }

}