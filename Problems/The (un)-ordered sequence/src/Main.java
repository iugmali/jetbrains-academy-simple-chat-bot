import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean orderedSeq = true;
        boolean ascending = false;
        boolean descending = false;
        int nextInt = sc.nextInt();
        int lastInt;
        while (true) {
            lastInt = nextInt;
            nextInt = sc.nextInt();
            if (nextInt == 0) {
                break;
            } else if (nextInt > lastInt) {
                 if (descending) orderedSeq = false;
                 ascending = true;
            } else if (nextInt < lastInt) {
                if (ascending) orderedSeq = false;
                descending = true;
            }
        }
        System.out.println(orderedSeq);
    }
}