package TugasPertemuanKe7;

import java.util.Scanner;

public class Tugas7 {

    static class Mahasiswa {
        String nama, npm, kelas;

        Mahasiswa(String nama, String npm, String kelas) {
            this.nama = nama;
            this.npm = npm;
            this.kelas = kelas;
        }

        void tampilkan() {
            System.out.println("\nData Mahasiswa");
            System.out.println("Nama: " + this.nama);
            System.out.println("NPM: " + this.npm);
            System.out.println("Kelas: " + this.kelas);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        System.out.print("Masukkan NPM: ");
        String npm = input.nextLine();

        System.out.print("Masukkan kelas: ");
        String kelas = input.nextLine();

        Mahasiswa mhs = new Mahasiswa(nama, npm, kelas);
        mhs.tampilkan();
    }
}