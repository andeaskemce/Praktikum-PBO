package TugasPertemuanKe7;

import java.util.Scanner;

public class Tugas3 {

    void tebakLahir(int bulan, int tanggal) {
        int hasil = (bulan * 100) + tanggal;
        System.out.println("Hasil tebakan: " + hasil);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Tugas3 tebak = new Tugas3();

        System.out.print("Masukkan bulan lahir (1-12): ");
        int bulan = input.nextInt();

        System.out.print("Masukkan tanggal lahir: ");
        int tanggal = input.nextInt();

        tebak.tebakLahir(bulan, tanggal);
    }
}
