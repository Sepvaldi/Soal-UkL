import java.util.Scanner;


public class perulanagnRatarata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan jumlah siswa: ");
        int jumlahSiswa = input.nextInt();
        int temp = 0;
        for (int i = 1; i <= jumlahSiswa; i++) {
            System.out.println("Masukkan nilai siswa ke-"+i);
            int nilai = input.nextInt();
            temp += nilai;
        }
        System.out.println("Rata-Rata Jumlah Siswa "+jumlahSiswa+" adalah "+ temp/jumlahSiswa);
    }   
}