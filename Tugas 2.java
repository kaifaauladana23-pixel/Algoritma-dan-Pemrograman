import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Golongan (A/B/C): ");
        String gol = input.next().toUpperCase();
        System.out.print("Masukkan Jam Lembur: ");
        int jam = input.nextInt();

        double gaji = 0;
        double persen = 0;

        if (gol.equals("A")) { gaji = 5000000; }
        else if (gol.equals("B")) { gaji = 6500000; }
        else if (gol.equals("C")) { gaji = 9500000; }

        if (jam == 1) { persen = 0.30; }
        else if (jam == 2) { persen = 0.32; }
        else if (jam == 3) { persen = 0.34; }
        else if (jam == 4) { persen = 0.36; }
        else if (jam >= 5) { persen = 0.38; }

        double lembur = gaji * persen;
        double total = gaji + lembur;

        // Menampilkan seluruh rincian gaji tanpa notasi ilmiah
        System.out.printf("Gaji pokok: Rp %,.0f%n", gaji);
        System.out.printf("Hasil lemburan: Rp %,.0f%n", lembur);
        System.out.printf("Jumlah penghasilan: Rp %,.0f%n", total);
        
        input.close();
    }
}
