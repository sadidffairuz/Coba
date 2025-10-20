import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input dua angka: ");
        int inp1 = sc.nextInt();
        System.out.println("Input dua angka: ");
        int inp2 = sc.nextInt();

        int hasil = inp1 + inp2;

        System.out.println("Penjumlahan " + inp1 + " + " + inp2 + " = " + hasil);
    }
}
