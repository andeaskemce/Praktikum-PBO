package Pertemuan3;

import java.util.Scanner;

public class Tugas4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Massa benda (kg): ");
        double m = sc.nextDouble();

        System.out.print("Kecepatan (m/s): ");
        double v = sc.nextDouble();

        System.out.print("Jari-jari (m): ");
        double r = sc.nextDouble();

        if (m < 0 || r <= 0) {
            System.out.println("Data yang dimasukkan tidak valid.");
        } else {

            double hasil = m * Math.pow(v, 2) / r;

            System.out.println("\n===== GAYA SENTRIPETAL =====");
            System.out.println("Massa benda : " + m + " kg");
            System.out.println("Kecepatan   : " + v + " m/s");
            System.out.println("Jari-jari   : " + r + " m");
            System.out.println("Hasil gaya  : " + hasil + " Newton");
        }

        sc.close();
    }
}
