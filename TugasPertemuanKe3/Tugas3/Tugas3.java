package Pertemuan3;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Tugas3 {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("INPUT MENGGUNAKAN SCANNER");

        System.out.print("Nama: ");
        String nama = scanner.nextLine();

        System.out.print("Umur: ");
        int umur = scanner.nextInt();

        BufferedReader reader = new BufferedReader(
            new InputStreamReader(System.in)
        );

        System.out.println("\nINPUT MENGGUNAKAN BUFFEREDREADER");

        System.out.print("Nama: ");
        String namaBaru = reader.readLine();

        System.out.print("Umur: ");
        int umurBaru = Integer.parseInt(reader.readLine());

        System.out.println("\n===== DATA HASIL INPUT =====");
        System.out.println("Scanner: " + nama + ", " + umur + " tahun");
        System.out.println("BufferedReader: " + namaBaru + ", " + umurBaru + " tahun");

        scanner.close();
        reader.close();
    }
}
