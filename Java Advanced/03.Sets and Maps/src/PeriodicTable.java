import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Set<String> chemicals = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            String[] chemicalsInput = scanner.nextLine().split("\\s+");

            chemicals.addAll(Arrays.asList(chemicalsInput));
        }

        chemicals.forEach(x -> System.out.print(x + " "));
    }
}
