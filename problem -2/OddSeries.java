import java.util.Scanner;

public class OddNumberSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value (x): ");
        int x = scanner.nextInt();

        System.out.print("Output: ");
        for (int i = 0; i < x; i++) {
            int oddNumber = 2 * i + 1;
            System.out.print(oddNumber);
            if (i < x - 1) {
                System.out.print(", ");
            }
        }

        scanner.close();
    }
}
