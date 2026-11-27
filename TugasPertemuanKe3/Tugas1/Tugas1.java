package Pertemuan3;

import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan alamat: ");
        String alamat = input.nextLine();

        int[] gaji = {2000000, 300000, 200000, 150000};

        int total = 0;

        for (int angka : gaji) {
            total += angka;
        }

        double pajak = (gaji[0] + gaji[1] + gaji[3]) * 0.10;
        double bersih = total - pajak;

        System.out.println("\n===== DATA GAJI PEGAWAI =====");
        System.out.println("NIK              : " + nik);
        System.out.println("Nama             : " + nama);
        System.out.println("Alamat           : " + alamat);
        System.out.println("Jabatan          : Manajer");
        System.out.println("Gaji Pokok       : Rp" + gaji[0]);
        System.out.println("Tunjangan Jabatan: Rp" + gaji[1]);
        System.out.println("Tunjangan Istri  : Rp" + gaji[2]);
        System.out.println("Tunjangan Anak   : Rp" + gaji[3]);
        System.out.println("Total Gaji       : Rp" + total);
        System.out.println("Pajak            : Rp" + pajak);
        System.out.println("Gaji Bersih      : Rp" + bersih);

        input.close();
    }
}
