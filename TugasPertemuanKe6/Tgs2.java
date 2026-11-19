package TugasPertemuan6;

public class Tgs2 {
    public static void main(String[] args) {

        String[] kendaraan = {
            "Tesla", "Suzuki", "Civic", "Mazda", "BMW"
        };

        for (int posisi = 0; posisi < kendaraan.length; posisi++) {

            if (kendaraan[posisi].equals("Suzuki")) {
                kendaraan[posisi] = "Toyota";
                break;
            }
        }

        System.out.println("Daftar mobil terbaru:");

        int nomor = 1;
        for (String nama : kendaraan) {
            System.out.println(nomor + ". " + nama);
            nomor++;
        }
    }
}
