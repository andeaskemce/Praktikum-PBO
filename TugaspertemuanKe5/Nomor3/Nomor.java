package Pertemuan5PBO;

import java.util.Scanner;

public class Nomor3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak baris : ");
        int baris = input.nextInt();

        int angka = 1;

        for (int x = 1; x <= baris; x++) {
            for (int y = 1; y <= x; y++) {
                System.out.print(angka + " ");
                angka++;
            }

            System.out.println();
        }
    }
}
