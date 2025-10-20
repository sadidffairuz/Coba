import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input angka pertama: ");
        int inp1 = sc.nextInt();
        System.out.println("Input angka kedua: ");
        int inp2 = sc.nextInt();

        int hasil = inp1 + inp2;

        System.out.println("angka 1: " + inp1);
        System.out.println("angka 2: " + inp2);
        System.out.println("Penjumlahan " + inp1 + " + " + inp2 + " = " + hasil);
    }
}
