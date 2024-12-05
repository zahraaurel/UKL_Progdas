import java.util.HashMap; //buat nyimpen frekuensi elemen
import java.util.Map;
import java.util.Scanner;

public class soalukl3sulit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input jumlah elemen 
        System.out.print("Masukkan jumlah yang ingin dihitung: ");
        // bikin array disimpen di variabel n
        int n = scanner.nextInt();

        // bikin array dengan ukuran n sesuai inputan
        int[] array = new int[n];

        // minta input tiap elemen
        System.out.println("Masukkan " + n + " elemen:");
        for (int i = 0; i < n; i++) { //loop
            System.out.print("Angka ke-" + (i + 1) + ": ");
        // ngambil input trs disimpen di i
            array[i] = scanner.nextInt(); 
        }

        // ngitung frekuensi trs hasil disimpen di Map namanya frekuensi
        Map<Integer, Integer> frekuensi = hitungFrekuensi(array);

        // cetak hasil
        cetakFrekuensi(frekuensi);
        scanner.close();
    }

    // method buat deklarasiin sm ngitung frekuensi elemen dalam array
    public static Map<Integer, Integer> hitungFrekuensi(int[] array) {
        Map<Integer, Integer> frekuensiMap = new HashMap<>(); //hm buat nyimpen elemen, frekuensi bwt nilai
        for (int elemen : array) { // loop tiap elemen
            frekuensiMap.put(elemen, frekuensiMap.getOrDefault(elemen, 0) + 1); //kalo udah ada frekuensi +1
        }
        return frekuensiMap; //ngembaliin frekuensi ke elemen
    }

    // cetak hasil frekuensi
    public static void cetakFrekuensi(Map<Integer, Integer> frekuensi) {
        for (Map.Entry<Integer, Integer> entry : frekuensi.entrySet()) { // loop literasi tiap entri 
            System.out.println(entry.getKey() + " muncul " + entry.getValue() + " kali"); // cetak muncul brp kali
        }
    }
}