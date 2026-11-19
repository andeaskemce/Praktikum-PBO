package TugasPertemuan6;

import java.util.Scanner;

public class Tgs3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Banyak data yang ingin dimasukkan: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Jumlah data harus lebih dari 0.");
            sc.close();
            return;
        }

        int[] nilai = new int[n];

        for (int x = 0; x < n; x++) {
            System.out.print("Masukkan angka ke-" + (x + 1) + ": ");
            nilai[x] = sc.nextInt();
        }

        int max = nilai[0];
        int min = nilai[0];
        int posisiMax = 0;
        int posisiMin = 0;

        int jumlah = 0;
        int totalGanjil = 0;
        int totalGenap = 0;

        for (int x = 0; x < n; x++) {

            jumlah = jumlah + nilai[x];

            if (nilai[x] >= max) {
                max = nilai[x];
                posisiMax = x;
            }

            if (nilai[x] <= min) {
                min = nilai[x];
                posisiMin = x;
            }

            if (x % 2 == 0) {
                totalGenap += nilai[x];
            } else {
                totalGanjil += nilai[x];
            }
        }

        System.out.println("\n=== HASIL PENGOLAHAN ===");
        System.out.println("Nilai tertinggi: " + max);
        System.out.println("Posisi indeks: " + posisiMax);

        System.out.println("Nilai terendah: " + min);
        System.out.println("Posisi indeks: " + posisiMin);

        System.out.println("Total semua angka: " + jumlah);
        System.out.println("Nilai rata-rata: " + (double) jumlah / n);

        System.out.println("Total indeks genap: " + totalGenap);
        System.out.println("Total indeks ganjil: " + totalGanjil);

        System.out.print("\nMasukkan angka terakhir NPM: ");
        int digit = sc.nextInt();

        int hasil;

        if (digit % 2 == 0) {
            hasil = totalGanjil;
        } else {
            hasil = totalGenap;
        }

        System.out.println("Hasil penjumlahan sesuai NPM: " + hasil);

        if (hasil % 2 == 0) {
            System.out.println("Hasilnya adalah bilangan genap.");
        } else {
            System.out.println("Hasilnya adalah bilangan ganjil.");
        }

        // Mengurutkan menggunakan Bubble Sort
        for (int a = 0; a < n - 1; a++) {
            for (int b = 0; b < n - a - 1; b++) {

                if (nilai[b] > nilai[b + 1]) {
                    int sementara = nilai[b];
                    nilai[b] = nilai[b + 1];
                    nilai[b + 1] = sementara;
                }
            }
        }

        System.out.println("\nData setelah diurutkan:");

        for (int angka : nilai) {
            System.out.print(angka + " ");
        }

        sc.close();
    }
}
