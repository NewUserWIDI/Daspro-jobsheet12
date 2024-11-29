import java.util.Scanner;

public class Tugas3 {
static boolean cek(int n, int i) {
    if (i * i > n) {
    return true;
    }
    if (n % i == 0) {
    return false;
    }
    return cek(n, i + 1);
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Masukkan bilangan untuk dicek apakah prima: ");
    int n = scanner.nextInt();
    if (n >= 2 && cek(n, 2)) {
    System.out.println(n + " adalah bilangan prima.");
    } else {
    System.out.println(n + " bukan bilangan prima.");
    }
    }
}