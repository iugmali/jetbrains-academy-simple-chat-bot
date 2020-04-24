import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        if (units >= 1000) {
            System.out.println("legion");
        } else if (units >= 250) {
            System.out.println("zounds");

        } else if (units >= 20) {
            System.out.println("throng");

        } else if (units >= 1) {
            System.out.println("pack");

        } else {
            System.out.println("no army");
        }
    }
}