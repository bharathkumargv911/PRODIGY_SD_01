import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the temperature value:");
        double temperature = scanner.nextDouble();
        System.out.println("Enter the original unit of measurement (C for Celsius, F for Fahrenheit, K for Kelvin):");
        String unit = scanner.next();

        if (unit.equalsIgnoreCase("C")) {
            double fahrenheit = (temperature * 9 / 5) + 32;
            double kelvin = temperature + 273.15;
            System.out.printf("The equivalent temperature in Fahrenheit is: %.2f°F\n", fahrenheit);
            System.out.printf("The equivalent temperature in Kelvin is: %.2fK\n", kelvin);
        } else if (unit.equalsIgnoreCase("F")) {
            double celsius = (temperature - 32) * 5 / 9;
            double kelvin = (temperature - 32) * 5 / 9 + 273.15;
            System.out.printf("The equivalent temperature in Celsius is: %.2f°C\n", celsius);
            System.out.printf("The equivalent temperature in Kelvin is: %.2fK\n", kelvin);
        } else if (unit.equalsIgnoreCase("K")) {
            double celsius = temperature - 273.15;
            double fahrenheit = (temperature - 273.15) * 9 / 5 + 32;
            System.out.printf("The equivalent temperature in Celsius is: %.2f°C\n", celsius);
            System.out.printf("The equivalent temperature in Fahrenheit is: %.2f°F\n", fahrenheit);
        } else {
            System.out.println("Invalid input. Please enter the temperature value and its unit again.");
        }
        scanner.close();
    }
}