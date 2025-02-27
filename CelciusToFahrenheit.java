import java.util.Scanner;  // Import the Scanner class for taking input

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9/5) + 32;

        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

        scanner.close();
    }
}
