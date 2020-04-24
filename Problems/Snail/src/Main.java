import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int height = scanner.nextInt();
        int days = scanner.nextInt();
        int nights = scanner.nextInt();
        for (int i = 1; ; i++) {
            height -= days;
            if (height <= 0) {
                System.out.println(i);
                System.exit(0);
            }
            height += nights;
        }
    }
}
