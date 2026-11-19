package TugasPertemuan6;

import java.util.Scanner;

public class Tgs6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Berapa banyak angka yang akan dihitung? ");
            int banyak = Integer.parseInt(sc.nextLine());

            if (banyak <= 0) {
                throw new IllegalArgumentException("Jumlah angka harus lebih dari nol.");
            }

            double[] data = new double[banyak];
            double hasilJumlah = 0;

            int i = 0;

            while (i < banyak) {

                System.out.print("Masukkan angka ke-" + (i + 1) + ": ");

                data[i] = Double.parseDouble(sc.nextLine());

                hasilJumlah += data[i];

                i++;
            }

            System.out.println("\nTotal seluruh angka: " + hasilJumlah);
            System.out.println("Rata-rata: " + hasilJumlah / banyak);

        } catch (NumberFormatException e) {

            System.out.println("Input salah! Masukkan angka yang benar.");

        } catch (IllegalArgumentException e) {

            System.out.println("Peringatan: " + e.getMessage());
        }

        sc.close();
    }
}
