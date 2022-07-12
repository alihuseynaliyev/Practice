import java.util.*;

public class Main {
    static Scanner sc = new Scanner(System.in);

    static int a = sc.nextInt();
    static int b = sc.nextInt();

    public static void main(String[] args) {
        printFromOneToClientEntered();
    }

    public static void printFromOneToClientEntered() {
        if (a == b) {
            return;
        }
        ;
        System.out.println(++a);
        printFromOneToClientEntered();
    }
}