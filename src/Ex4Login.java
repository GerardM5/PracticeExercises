import java.util.Scanner;

public class Ex4Login {

    private static final String EMAIL= "gerard@gmail.com";
    private static final String PASSWORD="Gerardo";

    public static void main(String[] args) {
        String email = askForEmail();
        String password = askForPassword();
        boolean isCorrectData = compareData(email,password);
        printIfIsCorrect(isCorrectData);
    }

    private static void printIfIsCorrect(boolean isCorrectData) {
        if (isCorrectData) System.out.println("Credenciales correctas, puedes entrar");
        else System.out.println("Error, no puedes pasar");
    }

    private static boolean compareData(String email, String password) {
        return email.equals(EMAIL) && password.equals(PASSWORD);
    }

    private static String askForPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu contraseña");
        return sc.next();
    }

    private static String askForEmail() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu correo");
        return sc.next();
    }
}
