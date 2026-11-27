package Tugas4;

import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan NIK: ");
        String nik = input.nextLine();

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan kode golongan (1-4): ");
        int golongan = input.nextInt();

        System.out.print("Status menikah? (ya/tidak): ");
        String status = input.next();

        System.out.print("Jumlah anak: ");
        int anak = input.nextInt();

        double gaji = 0;
        double pasangan = 0;
        double tunjanganAnak = 0;

        switch (golongan) {
            case 1:
                gaji = 1200000;
                break;
            case 2:
                gaji = 1500000;
                break;
            case 3:
                gaji = 1750000;
                break;
            case 4:
                gaji = 2000000;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                input.close();
                return;
        }

        if (status.equalsIgnoreCase("ya")) {
            pasangan = gaji * 0.10;
            tunjanganAnak = gaji * 0.05 * anak;
        }

        double totalTunjangan = pasangan + tunjanganAnak;
        double gajiBersih = gaji + totalTunjangan;

        System.out.println("\n=== DATA GAJI KARYAWAN ===");
        System.out.println("NIK: " + nik);
        System.out.println("Nama: " + nama);
        System.out.println("Gaji Pokok: Rp" + gaji);
        System.out.println("Tunjangan Pasangan: Rp" + pasangan);
        System.out.println("Tunjangan Anak: Rp" + tunjanganAnak);
        System.out.println("Total Tunjangan: Rp" + totalTunjangan);
        System.out.println("Gaji Bersih: Rp" + gajiBersih);

        input.close();
    }
}