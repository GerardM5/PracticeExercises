import java.util.Scanner;

public class Ex8CuentaBancaria {

    private static final int DEPOSIT = 1;
    private static final int REMOVE = 2;
    private static final int EXIT = 3;
    private static final double COMISSION = 0.95;


    public static void main(String[] args) {
        double currentMoney = 1000;
        int option = 0;

        while (option != EXIT) {
            printCurrentMoney(currentMoney);
            option = whatYouWantToDo();
            if (option == DEPOSIT) currentMoney = dipositMoney(currentMoney);
            if (option == REMOVE) currentMoney = removeMoney(currentMoney);
        }

    }

    private static void printCurrentMoney(double currentMoney) {
        System.out.println("Tienes " + currentMoney + "€ en el banco");
    }

    private static double removeMoney(double currentMoney) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres retirar?"); //acortar
        double moneyToRemove = sc.nextDouble();
        if (moneyToRemove <= currentMoney) return (currentMoney - moneyToRemove); //acortar
        else {
            System.out.println("No puedes retirar esa cantidad de dinero porque no tienes");
            return currentMoney;
        }
    }

    private static double dipositMoney(double currentMoney) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuanto dinero quieres ingresar? (Recuerda que no puede ser mas del doble de lo que tienes)");
        double moneyToDiposit = sc.nextDouble();
        if (currentMoney * 2 > moneyToDiposit) return (currentMoney + moneyToDiposit * COMISSION);
        else {
            System.out.println("No puedes ingresar esa cantidad de dinero");
            return currentMoney;
        }
    }

    private static int whatYouWantToDo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Que quieres hacer?\n1)Dipositar dinero\n2)Retirar dinero\n3)Salir");
        return sc.nextInt();
    }
}
