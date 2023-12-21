
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import controller.AppController;


public class App {

    public static void main(String[] args) throws Exception {
        AppController appController = new AppController();
        appController.setUp();
        boolean lanjut = true;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        appController.dataPenyewa();
        while (lanjut) {
            tampilkanMenu();
            System.out.print("Pilih menu:");
            String pilihan = reader.readLine();
            switch (pilihan) {
                case "1":
                    appController.sewa();
                    break;
                case "2":
                    appController.tampilkanLaporanPenyewaan();
                    break;
                default:
                    lanjut = false;
                    break;
            }
        }

        System.out.println("===SAMPAI JUMPA===");

    }

    public static void tampilkanMenu() {
        System.out.println("");
        System.out.println("1. Sewa");
        System.out.println("2. Cetak Struk");
        System.out.println("3. Keluar");
    }

}
