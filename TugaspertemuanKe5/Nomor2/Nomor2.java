package Pertemuan5PBO;

import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Berapa banyak bilangan? ");
        int jumlah = input.nextInt();

        double total = 0;

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan angka ke-" + i + " : ");
            double nilai = input.nextDouble();

            total += nilai;
        }

        double rataRata = total / jumlah;

        System.out.println("Total penjumlahan : " + total);
        System.out.println("Nilai rata-rata : " + rataRata);
    }
}
