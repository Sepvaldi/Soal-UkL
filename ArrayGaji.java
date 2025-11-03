package Array;

public class ArrayGaji {
    public static void main(String[] args) {
        String nama[] = {"Sep","Andriana","Denok","Daphin","Toro"};
        int Gaji[] = {3000000,5000000,4500000,3500000,6000000};
        int totalgaji = 0;

        System.out.println("~~~~~~~~~~~~Gaji Karyawan~~~~~~~~~~");
        for (int i = 0; i < Gaji.length; i++) {
            totalgaji += Gaji[i];
            System.out.println(nama[i] + " dengan gaji: " +"Rp."+Gaji[i] );
        }

        System.out.println();
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        int RataGaji = totalgaji/Gaji.length;
        System.out.println("Pengeluaran Gaji: " + "Rp."+totalgaji);
        System.out.println("Rata-rata Gaji: " + "Rp."+RataGaji);

    }
    
}
