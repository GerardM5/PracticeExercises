/*import java.util.Scanner;

public class Ex10BlackJack {
    private static final int WIN = 21;

    public static void main(String[] args) {
        int [] playerPoints = new int[howManyPlayersWillPlay()];
        for (int i = 0; i < playerPoints.length; i++) {
            playerPoints[i] = startGame(i);
        }
        whoIsWinner(playerPoints);
    }

    private static int startGame(int player) {
        int points = 0;
        while (points<WIN){
            System.out.println("Quieres una carta?");
        }

        return points;
    }

    private static int howManyPlayersWillPlay() {
        System.out.println("Cuantos jugadores van a participar?");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }
}
*/