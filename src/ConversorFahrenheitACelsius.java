import java.util.Scanner;

public class ConversorFahrenheitACelsius {


    public static void main(String[] args) { //(32 °F − 32) × 5 / 9 = 0 °C
        double fahrenheit = askFahrenheitValue();
        double celcius = convertToCelcius(fahrenheit);
        printResult(celcius, fahrenheit);

    }

    private static void printResult(double celcius, double farenheit) {
        System.out.println(farenheit + "º Fahrenheit equivalen a " + celcius + "º Celcius");
    }

    private static double convertToCelcius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    private static double askFahrenheitValue() {

        System.out.println("conversor de farenheit a celsius, introduce cantidad a convertir:");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }
}
