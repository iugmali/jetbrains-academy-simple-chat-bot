import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String returnStr = "";
        while (true) {
            int input = sc.nextInt();
            if (input == 0) {
                break;
            } else if (input < 0) {
                returnStr += "not a natural number\n";
            } else if (input % 2 == 0) {
                returnStr += "even\n";
            } else {
                returnStr += "odd\n";
            }
        }
        System.out.println(returnStr);
    }
}