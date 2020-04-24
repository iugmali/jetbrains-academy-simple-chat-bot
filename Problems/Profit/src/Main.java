import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double money = sc.nextInt();
        int percent = sc.nextInt();
        int expected = sc.nextInt();
        int years = 0;
        if (money > 0 && percent > 0 && expected > 0 && expected >= money) {
            while (money < expected) {
                money = money + money * percent / 100;
                years++;
            }
            System.out.println(years);
        }
    }
}