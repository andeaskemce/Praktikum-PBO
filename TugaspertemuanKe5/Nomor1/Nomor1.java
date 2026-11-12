package Pertemuan5PBO;

import java.util.Scanner;

public class Nomor1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka, terbesar = Integer.MIN_VALUE;
        int terkecil = Integer.MAX_VALUE;

        for (int urutan = 1; urutan <= 10; urutan++) {
            System.out.print("Angka ke-" + urutan + " : ");
            angka = input.nextInt();

            if (angka > terbesar) {
                terbesar = angka;
            }

            if (angka < terkecil) {
                terkecil = angka;
            }
        }

        System.out.println("Bilangan terbesar : " + terbesar);
        System.out.println("Bilangan terkecil : " + terkecil);
    }
}
