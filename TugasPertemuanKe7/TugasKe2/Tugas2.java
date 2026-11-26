package TugasPertemuanKe7;

import java.util.Scanner;

public class Tugas2 {

    int keliling(int panjang, int lebar) {
        return 2 * (panjang + lebar);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Tugas2 hitung = new Tugas2();

        System.out.print("Masukkan panjang: ");
        int p = input.nextInt();

        System.out.print("Masukkan lebar: ");
        int l = input.nextInt();

        System.out.println("Keliling persegi panjang: " + hitung.keliling(p, l));
    }
}
