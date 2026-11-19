package TugasPertemuan6;

import java.util.Scanner;

public class Tgs8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah thread anak: ");
        int banyak = sc.nextInt();

        Thread[] daftarThread = new Thread[banyak];

        for (int i = 0; i < banyak; i++) {

            final int nomor = i + 1;

            daftarThread[i] = new Thread(() -> {

                System.out.println("Thread anak ke-" + nomor + " sedang berjalan.");

            });

            daftarThread[i].start();
        }

        System.out.println("Thread utama selesai membuat thread anak.");

        sc.close();
    }
}
