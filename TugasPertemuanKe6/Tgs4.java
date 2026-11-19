package TugasPertemuan6;

import java.util.Scanner;

public class Tgs4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Jumlah mahasiswa: ");
        int banyak = sc.nextInt();
        sc.nextLine();

        String[] mahasiswa = new String[banyak];
        int[] skor = new int[banyak];

        for (int i = 0; i < banyak; i++) {

            System.out.println("\nData mahasiswa ke-" + (i + 1));

            System.out.print("Nama mahasiswa: ");
            mahasiswa[i] = sc.nextLine();

            System.out.print("Masukkan nilai: ");
            skor[i] = sc.nextInt();
            sc.nextLine();
        }

        System.out.println("\n========== DAFTAR NILAI MAHASISWA ==========");
        System.out.printf("%-5s %-22s %-10s %-15s%n",
                "No", "Nama", "Nilai", "Status");

        for (int i = 0; i < banyak; i++) {

            String keterangan = skor[i] > 50 ? "Lulus" : "Tidak Lulus";

            System.out.printf("%-5d %-22s %-10d %-15s%n",
                    i + 1, mahasiswa[i], skor[i], keterangan);
        }

        sc.close();
    }
}
