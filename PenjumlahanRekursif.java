import java.util.Scanner;

public class PenjumlahanRekursif {
    static int hitungPenjumlahan(int n, StringBuilder deret) {
        if (n == 0) {
            return 0;  
        } else {
            int result = n + hitungPenjumlahan(n - 1, deret);

            if (n > 1) {
                deret.insert(0, n + "+"); 
            } else {
                deret.insert(0, n);
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int f;

     
        System.out.print("Masukkan nilai f: ");
        f = sc.nextInt();


        StringBuilder deret = new StringBuilder();

        int hasil = hitungPenjumlahan(f, deret);
        System.out.println("Deret penjumlahan: " + deret + " = " + hasil);
    }
}