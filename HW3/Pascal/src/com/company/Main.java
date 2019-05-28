import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        conclusion(rows);
        scanner.close();
    }

    public static void conclusion(int n) {
        for (int i = 0; i < n; i++) {
            for (int k = 0; k < n - i; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(calculation(i, j) + " ");
            }
            System.out.println();
        }
    }

    public static int calculation(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        } else {
            return calculation(i - 1, j - 1) + calculation(i - 1, j);
        }
    }
} 