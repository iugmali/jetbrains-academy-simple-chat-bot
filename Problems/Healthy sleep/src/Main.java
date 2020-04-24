import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sleepMin = sc.nextInt();
        int sleepMax = sc.nextInt();
        int sleepHrs = sc.nextInt();
        if (sleepMax < sleepMin) {
            System.exit(1);
        }
        if (sleepHrs > sleepMax) {
            System.out.println("Excess");
        } else if (sleepHrs >= sleepMin) {
            System.out.println("Normal");
        } else {
            System.out.println("Deficiency");
        }
    }
}