import java.util.Random; //Menghasilkan angka acak
import java.util.Scanner;

public class soaluklsedang3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continueQuiz = true;

        while (continueQuiz) {
            // Menghasilkan bilangan acak antara 1-10
            int bilanganPertama = random.nextInt(10) + 1; // Bilangan pertama antara 1-10
            int bilanganKedua = random.nextInt(10) + 1; // Bilangan kedua antara 1-10
            String operator = getRandomOperator(random);

            // Menampilkan pertanyaan
            System.out.println("Soal: " + bilanganPertama + " " + operator + " " + bilanganKedua);
            System.out.print("Jawaban Anda: ");

            // Memastikan input adalah angka
            while (!scanner.hasNextDouble()) {
                System.out.println("Input tidak valid. Silakan masukkan angka.");
                scanner.next(); // Menghapus input yang salah
                System.out.print("Jawaban Anda: ");
            }
            double jawabanUser  = scanner.nextDouble();

            // Menghitung jawaban yang benar
            double jawabanBenar = calculateAnswer(bilanganPertama, bilanganKedua, operator);

            // Memeriksa jawaban
            if (jawabanUser  == jawabanBenar) {
                System.out.println("Jawaban Anda benar!");
            } else {
                System.out.println("Jawaban Anda salah. Jawaban yang benar adalah: " + jawabanBenar);
            }

            // Menanyakan apakah ingin melanjutkan kuis
            System.out.print("Apakah Anda ingin melanjutkan kuis? (y/n): ");
            char lanjut = scanner.next().charAt(0);
            if (lanjut != 'y' && lanjut != 'Y') {
                continueQuiz = false;
            }
        }

        System.out.println("Terima kasih telah mengikuti kuis!");
        scanner.close();
    }

    private static String getRandomOperator(Random random) {
        String[] operators = { "*", "/", "%" };
        return operators[random.nextInt(operators.length)];
    }

    private static double calculateAnswer(int bilanganPertama, int bilanganKedua, String operator) {
        switch (operator) {
            case "*": //Setiap case memeriksa apakah ekspresi cocok dengan nilai tertentu. Jika cocok, blok kode di bawah case tersebut akan dieksekusi.
                return bilanganPertama * bilanganKedua;
            case "/":
                // Menghindari pembagian dengan nol
                if (bilanganKedua == 0) {
                    throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
                }
                return (double) bilanganPertama / bilanganKedua; // Menggunakan double untuk hasil pembagian
            case "%":
                return bilanganPertama % bilanganKedua;
            default: //Digunakan jika tidak ada case yg cocok dengan ekspresi
                throw new IllegalArgumentException("Operator tidak dikenal: " + operator);
        }
    }
}