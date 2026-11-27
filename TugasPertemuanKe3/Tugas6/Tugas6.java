package Pertemuan3;

import java.util.Scanner;

public class Tugas6 {

    static int ubahKeDetik(int jam, int menit, int detik) {
        return (jam * 3600) + (menit * 60) + detik;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan waktu pertama");
        System.out.print("Jam: ");
        int j1 = sc.nextInt();

        System.out.print("Menit: ");
        int m1 = sc.nextInt();

        System.out.print("Detik: ");
        int d1 = sc.nextInt();

        System.out.println("\nMasukkan waktu kedua");
        System.out.print("Jam: ");
        int j2 = sc.nextInt();

        System.out.print("Menit: ");
        int m2 = sc.nextInt();

        System.out.print("Detik: ");
        int d2 = sc.nextInt();

        int pertama = ubahKeDetik(j1, m1, d1);
        int kedua = ubahKeDetik(j2, m2, d2);

        int selisih = Math.abs(pertama - kedua);

        int hasilJam = selisih / 3600;
        int hasilMenit = (selisih % 3600) / 60;
        int hasilDetik = selisih % 60;

        System.out.println("\n===== SELISIH WAKTU =====");
        System.out.println(hasilJam + " jam");
        System.out.println(hasilMenit + " menit");
        System.out.println(hasilDetik + " detik");

        sc.close();
    }
}
