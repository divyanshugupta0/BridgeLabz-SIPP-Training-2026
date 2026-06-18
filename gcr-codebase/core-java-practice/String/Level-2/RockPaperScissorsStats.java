import java.util.Scanner;

public class RockPaperScissorsStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int games = Integer.parseInt(scanner.nextLine());
        int playerWins = 0;
        int computerWins = 0;
        String[][] history = new String[games][3];
        for (int i = 0; i < games; i++) {
            String playerChoice = scanner.nextLine();
            String computerChoice = computerChoice();
            String winner = findWinner(playerChoice, computerChoice);
            history[i][0] = playerChoice;
            history[i][1] = computerChoice;
            history[i][2] = winner;
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            }
        }
        String[][] stats = computeStats(playerWins, computerWins, games);
        System.out.println("Player Computer Winner");
        for (int i = 0; i < games; i++) {
            System.out.println(history[i][0] + " " + history[i][1] + " " + history[i][2]);
        }
        System.out.println("PlayerWin% " + stats[0][0]);
        System.out.println("ComputerWin% " + stats[0][1]);
    }

    public static String computerChoice() {
        int value = (int) (Math.random() * 3);
        if (value == 0) {
            return "rock";
        }
        if (value == 1) {
            return "paper";
        }
        return "scissors";
    }

    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) {
            return "Draw";
        }
        if (player.equals("rock") && computer.equals("scissors")) {
            return "Player";
        }
        if (player.equals("scissors") && computer.equals("paper")) {
            return "Player";
        }
        if (player.equals("paper") && computer.equals("rock")) {
            return "Player";
        }
        return "Computer";
    }

    public static String[][] computeStats(int playerWins, int computerWins, int totalGames) {
        String[][] result = new String[1][2];
        double playerPercent = totalGames == 0 ? 0 : (playerWins * 100.0) / totalGames;
        double computerPercent = totalGames == 0 ? 0 : (computerWins * 100.0) / totalGames;
        result[0][0] = String.valueOf((int) playerPercent);
        result[0][1] = String.valueOf((int) computerPercent);
        return result;
    }
}
