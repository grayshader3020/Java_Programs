import java.util.Scanner;

class GoodPrimeCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Num:");
        int num = sc.nextInt();
        int cnt = 0;

        for (int i = 1; i <= num; i++) {
            boolean flag = true;
            
            // Check if the number is prime
            if (i <= 1) {
                flag = false;
            } else {
                for (int j = 2; j <= i / 2; j++) {
                    if (i % j == 0) {
                        flag = false;
                        break;
                    }
                }
            }

            // Check if all digits are prime
            boolean digitsPrime = true;
            if (flag) {
                int dup = i; // Change num to i to check each number in the range
                while (dup > 0) {
                    int rem = dup % 10;
                    if (rem != 2 && rem != 3 && rem != 5 && rem != 7) {
                        digitsPrime = false;
                        break;
                    }
                    dup /= 10;
                }
            }

            // Increment count if both conditions are satisfied
            if (flag && digitsPrime) {
                cnt++;
				System.out.println(i);
            }
        }
        System.out.println("Count of good primes: " + cnt);
    }
}