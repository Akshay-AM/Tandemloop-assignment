import java.util.Scanner;

public class OddSeriesUpToA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value (a): ");
        int a = scanner.nextInt();

        System.out.print("Output: ");
        for (int i = 1; i <= a; i += 2) {
            System.out.print(i);
            if (i + 2 <= a) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
