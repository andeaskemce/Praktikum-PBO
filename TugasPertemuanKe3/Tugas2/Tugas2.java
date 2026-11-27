package Pertemuan3;

import java.io.*;

public class Tugas2 {
    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Nama pembeli: ");
        String nama = input.readLine();

        System.out.print("Total belanja: ");
        double belanja = Double.parseDouble(input.readLine());

        System.out.print("Diskon (%): ");
        double diskon = Double.parseDouble(input.readLine());

        double potongan = belanja * diskon / 100;
        double total = belanja - potongan;

        System.out.println("Total setelah diskon: " + total);

        System.out.print("Uang bayar: ");
        double bayar = Double.parseDouble(input.readLine());

        if (bayar < total) {
            System.out.println("Pembayaran tidak mencukupi.");
        } else {

            double kembali = bayar - total;

            try (DataOutputStream keluar = new DataOutputStream(
                    new FileOutputStream("transaksi.dat"))) {

                keluar.writeUTF(nama);
                keluar.writeDouble(belanja);
                keluar.writeDouble(diskon);
                keluar.writeDouble(total);
                keluar.writeDouble(bayar);
                keluar.writeDouble(kembali);
            }

            try (DataInputStream masuk = new DataInputStream(
                    new FileInputStream("transaksi.dat"))) {

                System.out.println("\n===== STRUK PEMBELIAN =====");
                System.out.println("Nama       : " + masuk.readUTF());
                System.out.println("Total Belanja: " + masuk.readDouble());
                System.out.println("Diskon     : " + masuk.readDouble() + "%");
                System.out.println("Total      : " + masuk.readDouble());
                System.out.println("Bayar      : " + masuk.readDouble());
                System.out.println("Kembalian  : " + masuk.readDouble());
            }
        }
    }
}
