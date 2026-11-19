package TugasPertemuan6;

class JalankanProses extends Thread {

    public void run() {

        int hitung = 1;

        while (hitung <= 5) {

            System.out.println("Proses sedang berjalan: " + hitung);

            hitung++;
        }

        System.out.println("Semua proses telah selesai.");
    }
}

public class Tgs7 {
    public static void main(String[] args) {

        JalankanProses tugas = new JalankanProses();

        System.out.println("Memulai thread...");

        tugas.start();
    }
}
