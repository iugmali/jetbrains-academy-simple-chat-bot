import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = 0;
        while (true) {
            int i = sc.nextInt();
            if (i == 0) {
                break;
            } else if (i > 0) {
                length++;
            }
        }
        System.out.println(length);
    }
}