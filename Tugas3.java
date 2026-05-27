import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        
        int[] arrayGaji = {5000000, 6500000, 9500000};
        double[] arrayLembur = {0.30, 0.32, 0.34, 0.36, 0.38};

        
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        String golongan = input.next().toUpperCase(); 

        System.out.print("Masukkan Jumlah Jam Lembur: ");
        int jamLembur = input.nextInt();

        int gajiPokok = 0;
        double persenLembur = 0;

        //Gaji
        if (golongan.equals("A")) {
            gajiPokok = arrayGaji[0];
        } else if (golongan.equals("B")) {
            gajiPokok = arrayGaji[1];
        } else if (golongan.equals("C")) {
            gajiPokok = arrayGaji[2];
        } else {
            System.out.println("Golongan tidak valid!");
            input.close();
            return; 
        }

        //Lembur
        if (jamLembur == 1) {
            persenLembur = arrayLembur[0];
        } else if (jamLembur == 2) {
            persenLembur = arrayLembur[1];
        } else if (jamLembur == 3) {
            persenLembur = arrayLembur[2];
        } else if (jamLembur == 4) {
            persenLembur = arrayLembur[3];
        } else if (jamLembur >= 5) {
            persenLembur = arrayLembur[4];
        } else {
            persenLembur = 0; 
        }

        
        double totalUangLembur = gajiPokok * persenLembur;
        double totalGajiDiterima = gajiPokok + totalUangLembur;

        
        System.out.println("\n--- RINCIAN GAJI KARYAWAN ---");
        System.out.println("Golongan        : " + golongan);
        System.out.println("Gaji Pokok      : Rp. " + gajiPokok);
        System.out.println("Jam Lembur      : " + jamLembur + " Jam");
        System.out.println("Uang Lembur     : Rp. " + (int)totalUangLembur);
        System.out.println("Total Diterima  : Rp. " + (int)totalGajiDiterima);

        input.close();
    }
}
