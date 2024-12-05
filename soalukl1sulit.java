import java.util.Scanner;
public class soalukl1sulit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // masukin jumlah siswa
        System.out.print("Masukkan jumlah siswa: ");
        int jumlahSiswa = scanner.nextInt();

        // buat nyimpen array nilai ujian
        double[] nilaiUjian = new double[jumlahSiswa];

        // bwt masukin nilai ujian
        for (int i = 0; i < jumlahSiswa; i++) {
            System.out.print("Masukkan nilai ujian siswa ke-" + (i + 1) + ": ");
            nilaiUjian[i] = scanner.nextDouble();
        }

        // bwt rata-rata nilai
        double total = 0;
        for (double nilai : nilaiUjian) {
            total += nilai;
        }
        double rataRata = total / jumlahSiswa;

        // print rata nilai
        System.out.printf("Rata-rata nilai ujian adalah: %.2f%n", rataRata);

        
        
    }
}