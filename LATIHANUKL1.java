import java.util.Scanner;

public class LATIHANUKL1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //INPUTAN PENGIRIMAN BARANG
        System.out.println("Masukkan jarak Tempuh (km)");
        int jarak = input.nextInt();
        System.out.println("Masukkan berat");
        int berat = input.nextInt();
        System.out.println("Masukkan panjang barang");
        int panjang = input.nextInt();
        System.out.println("Masukkan lebar barang");
        int lebar = input.nextInt();
        System.out.println("Masukkan tinggi barang");
        int tinggi = input.nextInt();

        //INPUTAN SYSTEM
        double tambahan = 0;
        if (jarak < 10 || jarak == 10) {
            tambahan += 4250 * berat;
        }
        else if (jarak > 10) {
            tambahan += 6000 * berat;
            
        }
        
        double volume = panjang * lebar * tinggi;
        if (volume < 100) {
            tambahan += 50000;
        }

        //INPUTAN HASIL
        int hasil = (int) (volume * jarak);
        System.out.println("TOTAL PENGIRIMAN");
        System.out.println("Total biaya: " + hasil);
    }
    
}
