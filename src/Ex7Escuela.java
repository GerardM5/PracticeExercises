import java.util.Scanner;

public class Ex7Escuela {

    private static final int A_GROUP = 1;
    private static final int B_GROUP = 2;
    private static final int MAX_AGE_A_GROUP = 14;

    public static void main(String[] args) {

        int ageUser = askAgeUser();
        int group = chooseGroup(ageUser);
        printClass(group);
    }

    private static void printClass(int group) {
        if (group==A_GROUP) System.out.println("Estas en el grupo A");
        else System.out.println("Estas en el grupo B");
    }

    private static int chooseGroup(int ageUser) {
        if (ageUser>=MAX_AGE_A_GROUP) return A_GROUP;
        else return B_GROUP;
    }

    private static int askAgeUser() {
        System.out.println("Dime tu edad para saber a que clase te toca ir");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
