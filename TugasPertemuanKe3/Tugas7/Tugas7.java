package Pertemuan3;

import java.util.Scanner;

public class Tugas7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Berapa novel yang dicetak? ");
        long jumlahNovel = sc.nextLong();

        System.out.print("Berapa lembar setiap novel? ");
        long lembarNovel = sc.nextLong();

        if (jumlahNovel < 0 || lembarNovel < 0) {

            System.out.println("Jumlah tidak boleh negatif.");

        } else {

            long semuaLembar = jumlahNovel * lembarNovel;

            long hari = semuaLembar / 86400;
            long jam = (semuaLembar % 86400) / 3600;
            long menit = (semuaLembar % 3600) / 60;
            long detik = semuaLembar % 60;

            System.out.println("\n===== WAKTU PENCETAKAN =====");
            System.out.println("Jumlah novel       : " + jumlahNovel);
            System.out.println("Lembar per novel   : " + lembarNovel);
            System.out.println("Total lembar       : " + semuaLembar);

            System.out.println("\nWaktu yang dibutuhkan:");
            System.out.println(hari + " hari");
            System.out.println(jam + " jam");
            System.out.println(menit + " menit");
            System.out.println(detik + " detik");
        }

        sc.close();
    }
}
