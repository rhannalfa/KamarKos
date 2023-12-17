
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

import controller.AppController;
import model.Kamar;
import model.Penyewa;
import model.Owner;

public class App {

    public static void main(String[] args) throws Exception {
        AppController appController = new AppController();
        appController.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (lanjut) {
            tampilkanMenu();
            System.out.print("Pilih menu:");
            String pilihan = reader.readLine();
            switch (pilihan) {
                case "1":
                    appController.lihatDaftarKamar();
                    break;
                case "2":
                    appController.sewa();
                    break;
                case "3":
                    appController.tampilkanLaporanPenyewaan();
                    break;
                default:
                    lanjut = false;
                    break;
            }
        }

        System.out.println("Sampai Jumpa");

    }

    public static void tampilkanMenu() {
        System.out.println("1. Lihat daftar Kamar");
        System.out.println("2. Belanja");
        System.out.println("3. Laporan Penjualan");
        System.out.println("4. Keluar");
    }
    // public static void masukanNama() {
    //     System.out.print("Masukan Nama Pewnyewa : ");
    //     System.out.print("Masukan Email Pewnyewa : ");
    //     System.out.print("Masukan No Telp Pewnyewa : ");
    // }
}
