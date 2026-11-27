package Tugas4;

import java.util.Scanner;

public class Tugas6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Apakah memiliki kartu member? (ya/tidak): ");
        String member = input.nextLine();

        System.out.print("Masukkan total belanja: Rp");
        double belanja = input.nextDouble();

        double diskon = 0;

        if (member.equalsIgnoreCase("ya")) {

            if (belanja > 500000) {
                diskon = 50000;
            } else if (belanja > 100000) {
                diskon = 15000;
            }

        } else {

            if (belanja > 100000) {
                diskon = 10000;
            }
        }

        double totalBayar = belanja - diskon;

        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Total Belanja: Rp" + belanja);
        System.out.println("Diskon: Rp" + diskon);
        System.out.println("Total Bayar: Rp" + totalBayar);

        System.out.print("Uang Pembayaran: Rp");
        double uang = input.nextDouble();

        if (uang >= totalBayar) {
            double kembalian = uang - totalBayar;
            System.out.println("Kembalian: Rp" + kembalian);
        } else {
            System.out.println("Uang pembayaran kurang!");
            System.out.println("Kekurangan: Rp" + (totalBayar - uang));
        }

        input.close();
    }
}
