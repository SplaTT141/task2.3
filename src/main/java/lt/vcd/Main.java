package lt.vcd;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Iveskite metus:");
        int year = in.nextInt();

        if (year % 4 == 0 && year % 100 != 0) {
            System.out.print("Sie metai yra keliamieji");
        } else if (year % 400 == 0) {
            System.out.print("Sie metai yra keliamieji");
        } else {
            System.out.print("Sie metai nera keliamieji");
        }
    }
}
