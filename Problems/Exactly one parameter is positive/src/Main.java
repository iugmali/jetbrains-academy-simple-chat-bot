import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input1 = scanner.nextInt();
        int input2 = scanner.nextInt();
        int input3 = scanner.nextInt();
        boolean case1 = input1 > 0 && input2 <= 0 && input3 <= 0;
        boolean case2 = input1 <= 0 && input2 > 0 && input3 <= 0;
        boolean case3 = input1 <= 0 && input2 <= 0 && input3 > 0;
        System.out.println(case1 || case2 || case3);
    }
}