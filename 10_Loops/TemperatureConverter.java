import java.util.Scanner;

class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter temperature value: ");
        double temp = sc.nextDouble();

        System.out.println("Enter unit (C for Celsius, F for Fahrenheit, K for Kelvin): ");
        char unit = sc.next().toUpperCase().charAt(0);
        
        sc.close();

        if (unit == 'C') {
            System.out.println("Fahrenheit: " + (temp * 9 / 5 + 32));
            System.out.println("Kelvin: " + (temp + 273.15));
        } else if (unit == 'F') {
            System.out.println("Celsius: " + ((temp - 32) * 5 / 9));
            System.out.println("Kelvin: " + ((temp - 32) * 5 / 9 + 273.15));
        } else if (unit == 'K') {
            System.out.println("Celsius: " + (temp - 273.15));
            System.out.println("Fahrenheit: " + ((temp - 273.15) * 9 / 5 + 32));
        } else {
            System.out.println("Invalid unit entered.");
        }
    }
}
