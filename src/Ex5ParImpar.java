import java.util.Scanner;

public class Ex5ParImpar {

    private static final int PAIR = 0;

    public static void main(String[] args) {
        int num = askForNumber();
        boolean isPair = calculateIfIsPair(num);
        printIfIsPair(isPair);
    }

    private static void printIfIsPair(boolean isPair) {
        if (isPair) System.out.println("El numero es par");
        else System.out.println("El numero es impar");
    }

    private static boolean calculateIfIsPair(int num) {
        return num%2==PAIR;
    }

    private static int askForNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero y te digo si es par");
        return sc.nextInt();
    }
}
