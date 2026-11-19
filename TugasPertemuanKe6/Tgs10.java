package TugasPertemuan6;

public class Tgs10 {
    public static void main(String[] args) {

        Object[] campuran = new Object[5];

        campuran[0] = 19;
        campuran[1] = 0.2;
        campuran[2] = 'C';
        campuran[3] = "Java";
        campuran[4] = true;

        int urutan = 0;

        System.out.println("Data dalam array:");

        while (urutan < campuran.length) {

            System.out.println("Elemen " + urutan + " = " + campuran[urutan]);

            urutan++;
        }
    }
}
