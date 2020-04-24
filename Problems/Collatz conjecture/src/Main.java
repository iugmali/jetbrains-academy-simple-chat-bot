import java.util.Scanner;
class Main {
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int collatz = sc.nextInt();
      if (collatz > 0) {
        System.out.print(collatz);
        while (collatz != 1) {
          System.out.print(" ");
          if (collatz % 2 == 0) {
            collatz /= 2;
          } else {
            collatz *= 3;
            collatz++;
          }
          System.out.print(collatz);
        }
      }
  }
}