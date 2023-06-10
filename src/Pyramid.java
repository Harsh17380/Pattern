public class Pyramid {
    public static void main(String[] args) {
        int rows = 5;
        printPattern(rows, 1);
    }

    public static void printPattern(int rows, int n) {
        if (n > rows) {
            return;
        }

        printSpaces(rows - n);
        printStars(n);

        System.out.println();

        printPattern(rows, n + 1);
    }

    public static void printSpaces(int i) {
        if (i <= 0) {
            return;
        }

        System.out.print(" ");

        printSpaces(i - 1);
    }

    public static void printStars(int i) {
        if (i <= 0) {
            return;
        }

        System.out.print("* ");

        printStars(i - 1);
    }
}
