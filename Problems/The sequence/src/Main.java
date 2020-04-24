import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int expectedLength = sc.nextInt();
        int actualLength = 0;
        for (int i = 1; i <= expectedLength; i++) {
            for (int k = 1; k <= i; k++) {
                if (actualLength == expectedLength) {
                    break;
                }
                System.out.print(i + " ");
                actualLength++;
            }
        }
    }
}