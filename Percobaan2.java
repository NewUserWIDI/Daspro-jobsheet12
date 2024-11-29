import java.util.Scanner;
public class Percobaan2 {
    static String simbol = " ";
    static int hitungPangkat(int x, int y) {
        if (y==0) {
            simbol += "1";
            return (1);
        } else {
            simbol += x + "x";
            return (x * hitungPangkat(x, y - 1));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan, pangkat;

        System.out.print("Bilangan yang dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();
        
        System.out.print("Perhitungan: ");
        int hasil = hitungPangkat(bilangan, pangkat);
        System.out.println(simbol + " = " + hasil);
    }
}