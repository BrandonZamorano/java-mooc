
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LiteracyComparison {

    public static void main(String[] args) {
        List<LiteracyEstimate> literacyEstimates = readLiteracyEstimatesFromFile("literacy.csv");
        Collections.sort(literacyEstimates);

        for (LiteracyEstimate estimate : literacyEstimates) {
            System.out.println(estimate);
        }

    }

    public static List<LiteracyEstimate> readLiteracyEstimatesFromFile(String fileName) {
        List<LiteracyEstimate> list = new ArrayList<>();

        try {
            return Files.lines(Paths.get(fileName))
                    .map(line -> line.split(","))
                    .map(parts -> {
                        String theme = parts[0].trim();
                        String ageGroup = parts[1].trim();
                        String gender = parts[2].trim().split(" ")[0];
                        String country = parts[3].trim();
                        int year = Integer.valueOf(parts[4].trim());
                        double literacyPercentage = Double.valueOf(parts[5].trim());
                        return new LiteracyEstimate(theme, ageGroup, gender, country, year, literacyPercentage);
                    })
                    .collect(Collectors.toList());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
            return list;
        }
    }

}
