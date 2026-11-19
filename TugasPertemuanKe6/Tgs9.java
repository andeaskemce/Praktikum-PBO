package TugasPertemuan6;

public class Tgs9 {
    public static void main(String[] args) {

        int[] age = {12, 4, 5, 2, 6};

        System.out.println("Menampilkan menggunakan While:");

        int indeks = 0;

        while (indeks < age.length) {

            System.out.print(age[indeks] + " ");

            indeks++;
        }

        System.out.println("\n\nMenampilkan menggunakan Do While:");

        int posisi = 0;

        do {

            System.out.print(age[posisi] + " ");

            posisi++;

        } while (posisi < age.length);
    }
}