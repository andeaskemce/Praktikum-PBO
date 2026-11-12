package Pertemuan5PBO;

import java.util.Scanner;

public class Nomor4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyak angka : ");
        int batas = input.nextInt();

        int total = 0;
        int ganjil = 1;

        for (int i = 1; i <= batas; i++) {
            System.out.print(ganjil + " ");
            total = total + ganjil;
            ganjil += 2;
        }

        System.out.println("\nTotal penjumlahan : " + total);
    }
}
