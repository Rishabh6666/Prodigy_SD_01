import java.util.*;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is the unit of measurement? (Type the option number)");
        System.out.println("1. Celsius");
        System.out.println("2. Fahrenheit");
        System.out.println("3. Kelvin");
        int unit = sc.nextInt();
        System.out.print("Enter the value: ");
        double temp = sc.nextDouble();
        if (unit == 1) {
            double f = (temp * 1.8) + 32;
            double k = temp + 273.15;
            System.out.println("Fahrenheit: " + f);
            System.out.println("Kelvin: " + k);
        } else if (unit == 2) {
            double c = (temp - 32) / 1.8;
            double k = (temp + 459.67) * 5 / 9;
            System.out.println("Celsius: " + c);
            System.out.println("Kelvin: " + k);
        } else if (unit == 3) {
            double c = temp - 273.15;
            double f = temp * 9 / 5 - 459.67;
            System.out.println("Celsius: " + c);
            System.out.println("Fahrenheit: " + f);
        } else {
            System.out.println("Invalid option.");
        }
        sc.close();
    }
}