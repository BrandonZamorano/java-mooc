
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scanner.nextLine();

        System.out.println("Team:");
        String teamName = scanner.nextLine();

        ArrayList<GameResult> gameResults = readGameResultsFromFile(fileName);
        int gameCount = 0;
        int gameWins = 0;
        int gameLosses = 0;

        for (GameResult gameResult : gameResults) {
            //count game played
            if (gameResult.getTeam1Name().equals(teamName)
                    || gameResult.getTeam2Name().equals(teamName)) {
                gameCount++;

                // increment game wins or losses
                if (gameResult.getWinner().equals(teamName)) {
                    gameWins++;
                } else {
                    gameLosses++;
                }
            }

        }

        System.out.println("Games: " + gameCount);
        System.out.println("Wins: " + gameWins);
        System.out.println("Losses: " + gameLosses);

    }

    public static ArrayList<GameResult> readGameResultsFromFile(String file) {
        ArrayList<GameResult> gameResults = new ArrayList<>();
        try ( Scanner fileReader = new Scanner(Paths.get(file))) {
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();

                String[] parts = line.split(",");
                String team1 = parts[0];
                String team2 = parts[1];
                int team1Score = Integer.valueOf(parts[2]);
                int teams2Score = Integer.valueOf(parts[3]);

                gameResults.add(new GameResult(team1, team2, team1Score, teams2Score));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return gameResults;
    }

}
