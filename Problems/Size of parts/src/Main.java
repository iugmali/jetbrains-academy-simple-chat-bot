import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfParts = sc.nextInt();
        int shipped = 0;
        int toBeFixed = 0;
        int rejects = 0;
        for (int i = 0; i < numberOfParts; i++) {
            int input = sc.nextInt();
            if (input == -1) {
                rejects++;
            } else if (input == 0) {
                shipped++;
            } else if (input == 1) {
                toBeFixed++;
            }
        }
        System.out.println(shipped + " " + toBeFixed + " " + rejects);
    }
}