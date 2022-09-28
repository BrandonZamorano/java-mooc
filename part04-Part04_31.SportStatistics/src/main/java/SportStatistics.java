
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
        
        try (Scanner fileReader = new Scanner(Paths.get(fileName))) {
            int gameCount = 0;
            while (fileReader.hasNextLine()) {
                String line = fileReader.nextLine();
                
                if (line.contains(teamName)) {
                    gameCount++;
                }
                
            }
            System.out.println("Games: " + gameCount);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
