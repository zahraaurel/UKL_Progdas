public class soaluklsedang2 {

    static void hitungVolume(double r, double t) { 
        double volume = Math.PI * r * r * t; 
        System.out.println("Volume tabung dengan jari-jari " + r + " dan tinggi " + t + " adalah: " + volume);
    }
    static void hitungLuas(double r, double l) {
        double luas = Math.PI * r *r * l;
        System.out.println("Luas tabung dengan jari-jari " + r +" dan luas" + l + "adalah: " + luas);
    }   
    static void hitungtotal (double r)
    
    public static void main(String[]args) {
        hitungVolume(10, 10); 
        hitungLuas(10, 10);
    }     
}