package TugasPertemuanKe7;

class Mahasiswa {
    String nama = "Andeas";
    String jurusan = "Informatika";

    void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("Jurusan: " + jurusan);
    }
}

public class Tugas1 {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.tampilkan();
    }
}
