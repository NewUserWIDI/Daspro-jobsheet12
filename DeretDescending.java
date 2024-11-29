import java.util.Scanner;

public class DeretDescending {
    static void deretDescendingRekursif(int n){
        if (n < 0) {
            return;
        } else {
            System.out.print(n + " ");
            deretDescendingRekursif(n - 1);
        }
    }
    static void deretDescendingIteratif(int n){
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkkan bilangan n: ");
        int n = sc.nextInt();

        System.out.print("\nDeret Descending menggunakan Rekursif: ");
        deretDescendingRekursif(n);

        System.out.println("\n\nDeret Descending menggunakan Iteratif: ");
        deretDescendingIteratif(n);
    }
}