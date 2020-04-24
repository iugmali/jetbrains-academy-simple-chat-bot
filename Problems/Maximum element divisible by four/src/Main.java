import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxDivFour = 0;
        int interations = sc.nextInt();
        for (int i = 0; i < interations; i++) {
            int input = sc.nextInt();
            if (input % 4 == 0 && input > maxDivFour) {
                maxDivFour = input;
            }
        }
        System.out.println(maxDivFour);
    }
}