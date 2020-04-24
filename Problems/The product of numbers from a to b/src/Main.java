import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initInput = sc.nextInt();
        int finalInput = sc.nextInt();
        if (initInput > finalInput) {
            System.out.println("Second input needs to be bigger than the first one.");
            System.exit(1);
        }
        long result = 1;
        for (int i = initInput; i < finalInput; i++) {
            result *= i;
        }
        System.out.println(result);
    }
}