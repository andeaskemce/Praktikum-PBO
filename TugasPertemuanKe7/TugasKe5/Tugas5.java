package TugasPertemuanKe7;

public class Tugas5 {

    static void hitungMundur(int angka) {
        if (angka > 0) {
            System.out.println(angka);
            hitungMundur(angka - 1);
        }
    }

    public static void main(String[] args) {
        hitungMundur(5);
    }
}
