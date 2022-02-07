import java.util.Scanner;

public class Ex6Tributar {

    private static final int AGE_MIN = 16;
    private static final double EARNINGS_MIN = 1000;

    public static void main(String[] args) {
        int age = askForAge();
        double earnings = askForEarnings();
        boolean hasToTribute = checkIfHasToTribute(age, earnings);
        printIfHasToTribute(hasToTribute);

    }

    private static void printIfHasToTribute(boolean hasToTribute) {
        if (hasToTribute) System.out.println("Tienes que tributar");
        else System.out.println("No tienes que tributar");
    }

    private static boolean checkIfHasToTribute(int age, double earnings) {
        return age >= AGE_MIN && earnings >= EARNINGS_MIN;
    }

    private static double askForEarnings() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tus ingresos este mes:");
        return sc.nextDouble();
    }


    private static int askForAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad:");
        return sc.nextInt();
    }
}
