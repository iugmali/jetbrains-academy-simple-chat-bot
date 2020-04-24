import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int width = sc.nextInt();
        int segments = sc.nextInt();
        if ((segments % length == 0 || segments % width == 0) && segments < length * width) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}