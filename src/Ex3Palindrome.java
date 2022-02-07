import java.util.Scanner;

public class Ex3Palindrome {
    public static void main(String[] args) {
        String name = askForName();
        String turned = reverseName(name);
        boolean isPalindrome = compareIfIsPalindrome(name, turned);
        printResult(isPalindrome);
    }

    private static void printResult(boolean isPalindrome) {
        if (isPalindrome) System.out.println("La palabra escrita es palindrome");
        else System.out.println("La palabra escrita no es palindrome");
    }

    private static boolean compareIfIsPalindrome(String name, String reverse) {

        return name.equalsIgnoreCase(reverse);
    }

    private static String reverseName(String name) {
        String turned = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            turned = turned + name.charAt(i);
            System.out.println("Valor almacenado: "+ name.charAt(i));
            System.out.println("Contenido actual de turned: "+ turned);

        }
        return turned;
    }

    private static String askForName() {
        System.out.println("Dime un nombre para comprobar si es palíndromo ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }
}
