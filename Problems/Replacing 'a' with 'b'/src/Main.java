import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        String newString = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a') {
                newString += 'b';
            } else {
                newString += input.charAt(i);
            }
        }
        System.out.println(newString);
    }
}