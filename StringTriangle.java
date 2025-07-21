import java.util.Scanner;
public class StringTriangle {

    public static void printIsoscelesTriangleNoRepeat(String s) {
        if (s == null || s.isEmpty()) {
            System.out.println("empty space");
            return;
        }

        int n = s.length();
        int index = 0;
        int row = 1;

        // Determine the maximum number of full rows we can print
        while ((row * (row + 1)) / 2 <= n) {
            row++;
        }
        row--;

        index = 0;

        for (int i = 1; i <= row; i++) {
           
            for (int space = 0; space < row - i; space++) {
                System.out.print("  ");
            }

            for (int j = 0; j < i; j++) {
                if (index < n) {
                    System.out.print(s.charAt(index++) + " ");
                }
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to form triangle: ");
        String userInput = scanner.nextLine().trim();

        printIsoscelesTriangleNoRepeat(userInput);
    }
}
