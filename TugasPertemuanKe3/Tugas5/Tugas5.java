package Pertemuan3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas5 {
    public static void main(String[] args) throws IOException {

        BufferedReader baca = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.print("Masukkan jumlah mangga: ");
        int mangga = Integer.parseInt(baca.readLine());

        System.out.print("Masukkan jumlah jambu per tetangga: ");
        int jambu = Integer.parseInt(baca.readLine());

        int jumlahTetangga = 4;
        int manggaBusuk = 15;

        int jumlahJambu = jambu * jumlahTetangga;
        int jumlahAwal = mangga + jumlahJambu;
        int jumlahAkhir = jumlahAwal - manggaBusuk;

        System.out.println("\n===== PERHITUNGAN BUAH =====");
        System.out.println("Mangga dibeli       : " + mangga);
        System.out.println("Jambu dibeli        : " + jumlahJambu);
        System.out.println("Jumlah sebelum retur: " + jumlahAwal);
        System.out.println("Mangga dikembalikan : " + manggaBusuk);
        System.out.println("Jumlah akhir        : " + jumlahAkhir);
    }
}
