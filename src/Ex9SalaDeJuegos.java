import java.util.Scanner;

public class Ex9SalaDeJuegos {

    private static final int CHILDREN_PRICE = 0;
    private static final int TEENAGER_PRICE = 5;
    private static final int ADULT_PRICE = 10;

    public static void main(String[] args) {
        printPrices();
        int userAge = askUserAge();
        int tiketPrice = calculatePriceBasedOnAge(userAge);
        printFinalPrice(tiketPrice);
    }

    private static void printFinalPrice(int tiketPrice) {
        System.out.println("La entrada te va a costar " + tiketPrice+"€");
    }

    private static int calculatePriceBasedOnAge(int userAge) {
        if (userAge<=4) return CHILDREN_PRICE;
        if (userAge>4 && userAge<=18) return TEENAGER_PRICE;
        else return ADULT_PRICE;
    }

    private static int askUserAge() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos años tienes?");
        return sc.nextInt();
    }

    private static void printPrices() {
        System.out.println("Precios del salón:\n1)Hasta 4 años - gratis\n2)De 4 a 18 años - 5€\n3)A partir de 18 años - 10€");
    }
}
