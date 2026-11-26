package TugasPertemuanKe7;

class Civitas {
    String fakultas = "Fakultas Teknik";

    void tampilkanFakultas() {
        System.out.println("Fakultas: " + fakultas);
    }
}

class Dosen extends Civitas {
    String nama = "Pak Fuad";

    void tampilkan() {
        System.out.println("Dosen: " + nama);
        tampilkanFakultas();
    }
}

class Mahasiswa extends Civitas {
    String nama = "Andeas";

    void tampilkan() {
        System.out.println("Mahasiswa: " + nama);
        tampilkanFakultas();
    }
}

class Staff extends Civitas {
    String nama = "Ibu Nisa";

    void tampilkan() {
        System.out.println("Staff: " + nama);
        tampilkanFakultas();
    }
}

public class Tugas6 {
    public static void main(String[] args) {
        Dosen d = new Dosen();
        Mahasiswa m = new Mahasiswa();
        Staff s = new Staff();

        d.tampilkan();
        m.tampilkan();
        s.tampilkan();
    }
}
