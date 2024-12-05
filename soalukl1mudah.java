import java.util.Scanner;
public class soalukl1mudah {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jarakminimum = 10;
        int harga1 = 4250;
        int harga2 = 6000;
        int harga3 = 5000;
        int volumeminimum = 100;

        System.out.println("masukkan berat paket");
        int berat = input.nextInt();
        System.out.println("masukkan jarak tempuh");
        int jaraktempuh = input.nextInt();
        System.out.println("masukkan tinggi barang");
        int t = input.nextInt();
        System.out.println("masukkan lebar barang");
        int l = input.nextInt();
        System.out.println("masukkan panjang barang");
        int p = input.nextInt();

        int resultVolume = p*l*t;                

        // menghitung biaya yang harus dibayar ketika mengirim paket
    
        //berdasarkan jarak
        if (jaraktempuh <= jarakminimum) { //jarak kurang atau sama dengan dari
            int result1 = harga1*berat;
        // berdasarkan volume
        if (resultVolume > volumeminimum) {
            int finalResult = result1 +  harga3; //Menghitung dan menampilkan biaya akhir
            System.out.println("biaya yang harus dibayar Rp."+finalResult);
        } else {
            System.out.println("biaya yang harus dibayar Rp."+result1);
        }
        
    }else if (jaraktempuh > jarakminimum){ //jarak lebih dari
            int result2 = harga2 * berat;
        if (resultVolume  > volumeminimum) {
            int finalResult = result2 + harga3;
            System.out.println("biaya yang dibyar Rp."+finalResult);
            } else {
                System.out.println("biaya yang harus dibayar Rp."+result2);}
    
    }
            //ALGORITMANYA
        //analisi data mn yg bs dimasukkan di variabel kalo ada buat untk menyimpan
        // dilihat minta input berapa lalu dibuatkan
        // baca lagi soal selama 3 kali yang perlu dihitung apa dulu lalu buatkan, hasil perkalian di result volume
        // baca soal lagi lalu bikin percabangan,jarak tempuh dapet dari input
        
    }
}
