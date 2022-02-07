import java.util.Scanner;

public class EurPounds {
    private static final double EUR_TO_POUNDS = 0.83;
    private static final double POUNDS_TO_EUR = 1.20;
    private static final int TO_POUNDS = 1;
    private static final int TO_EUR = 2;

    public static void main(String[] args) {
        double money = askAmount();
        int option = whatDoYouWantToDo();
        if (option == TO_POUNDS) convertEurToPounds(money);
        if (option == TO_EUR) convertPoundsToEur(money);

    }

    private static void convertPoundsToEur(double money) {
        double moneyConversion = money * POUNDS_TO_EUR;
        System.out.println(money + " pounds son " + moneyConversion + " euros");
    }

    private static void convertEurToPounds(double money) {
        double moneyConversion = money * EUR_TO_POUNDS;
        System.out.println(money + " euros son " + moneyConversion + " pounds");
    }

    private static double askAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres convertir?");
        double money = sc.nextDouble();
        return money;
    }

    private static int whatDoYouWantToDo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que quieres convertir?\n1)EURO A POUND\n2)POUND A EURO");
        int option = sc.nextInt();
        return option;
    }

}
