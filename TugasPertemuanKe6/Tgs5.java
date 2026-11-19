package TugasPertemuan6;

import java.util.Scanner;

public class Tgs5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Banyak baris matriks: ");
        int m = sc.nextInt();

        System.out.print("Banyak kolom matriks: ");
        int n = sc.nextInt();

        int[][] pertama = new int[m][n];
        int[][] kedua = new int[m][n];

        System.out.println("\nInput nilai matriks pertama:");

        for (int baris = 0; baris < m; baris++) {
            for (int kolom = 0; kolom < n; kolom++) {
                System.out.print("Angka: ");
                pertama[baris][kolom] = sc.nextInt();
            }
        }

        System.out.println("\nInput nilai matriks kedua:");

        for (int baris = 0; baris < m; baris++) {
            for (int kolom = 0; kolom < n; kolom++) {
                System.out.print("Angka: ");
                kedua[baris][kolom] = sc.nextInt();
            }
        }

        System.out.println("\nHasil penjumlahan:");

        for (int baris = 0; baris < m; baris++) {

            for (int kolom = 0; kolom < n; kolom++) {

                int hasil = pertama[baris][kolom] + kedua[baris][kolom];

                System.out.print(hasil + "\t");
            }

            System.out.println();
        }

        sc.close();
    }
}
