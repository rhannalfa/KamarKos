package controller;
    import java.io.BufferedReader;
    import java.io.InputStreamReader;
    import java.time.LocalDate;
    import java.util.ArrayList;
    import java.util.HashMap;
    import java.util.Map;
    import java.util.Scanner;

    import model.Kamar;
    import model.Penyewa;
    import model.Owner;
    import model.Penyewaan;
    import model.DetailKamar;

public class AppController {
    HashMap<String, Kamar> kamars = new HashMap();
    HashMap<String, Penyewa> penyewas = new HashMap();
    HashMap<String, Owner> owners = new HashMap();
    ArrayList<Penyewaan>penyewaans = new ArrayList<>();

    public void setUp() {  
        Kamar kamarA1 = new Kamar();
        Kamar kamarA2 = new Kamar();
        Kamar kamarA3= new Kamar();
        Kamar kamarB1= new Kamar();
        Kamar kamarB2= new Kamar();
        Kamar kamarB3= new Kamar();
        
        kamarA1.setJenisKamar("Reguler(Kasur, Lemari, Wc diluar)")
                .setIdKamar("A1")
                .setHargaKamar(500000)
                .setIsAvailable(true);
                
        kamarA2.setJenisKamar("Reguler(Kasur, Lemari, Wc diluar)")
                .setIdKamar("A2")
                .setHargaKamar(500000)
                .setIsAvailable(true);

        kamarA3.setJenisKamar("Reguler(Kasur, Lemari, Wc diluar)")
                .setIdKamar("A3")
                .setHargaKamar(500000)
                .setIsAvailable(true);

        kamarB1.setJenisKamar("VIP(Kasur, Lemari, Wc didalam, AC)")
                .setIdKamar("B1")
                .setHargaKamar(1000000)
                .setIsAvailable(true);

        kamarB2.setJenisKamar("VIP(Kasur, Lemari, Wc didalam, AC)")
                .setIdKamar("B2")
                .setHargaKamar(1000000)
                .setIsAvailable(true);

        kamarB3.setJenisKamar("VIP(Kasur, Lemari, Wc didalam, AC)")
                .setIdKamar("B3")
                .setHargaKamar(1000000)
                .setIsAvailable(true);
        
        kamars.put(kamarA1.getIdKamar(), kamarA1);
        kamars.put(kamarA2.getIdKamar(), kamarA2);
        kamars.put(kamarA3.getIdKamar(), kamarA3);
        kamars.put(kamarB1.getIdKamar(), kamarB1);
        kamars.put(kamarB2.getIdKamar(), kamarB2);
        kamars.put(kamarB3.getIdKamar(), kamarB3);
        
        
        Penyewa Penyewa1 = new Penyewa();
        // Penyewa Penyewa2 = new Penyewa();

        Penyewa1.setIdPenyewa("P1")
                .setJenisKelamin("Laki-Laki")
                .setNoTelp("085797047633")
                .setNama("Raihan")
                .setEmail("raian@gmail.com").
                setAlamat("Bandung");
        // Penyewa2.setIdPenyewa("P2")
        //         .setJenisKelamin("Perempuan")
        //         .setNoTelp("085797047644")
        //         .setNama("Layla")
        //         .setEmail("layla@gmail.com")
        //         .setAlamat("Jakarta");

        penyewas.put(Penyewa1.getIdPenyewa(), Penyewa1);
        // penyewas.put(Penyewa2.getIdPenyewa(), Penyewa2);
        
        Owner Owner1 = new Owner();

        Owner1.setIdOwner("P1")
                .setJenisKelamin("Laki-Laki")
                .setNoTelp("085797035322")
                .setNama("Rifqi")
                .setEmail("rifqi@gmail.com")
                .setAlamat("Bandung");

        owners.put(Owner1.getIdOwner(), Owner1);
    }

    // public void Psewa(){
    //     Scanner input = new Scanner(System.in);
    //     boolean ulang = true;
    //     while (ulang) {
    //         System.out.println("========== Login Owner ==========");
    //         System.out.print("Masukan Nama: ");
    //         String nama = input.nextLine();
    //         System.out.println("");
            

    //         for(Owner owner : owners.values()) {
    //             if(owner.getNama().equals(nama)) {
    //                 System.out.println("Selamat Datang, " + owner.getNama());
    //                 System.out.println("");
    //                 ulang = false;
    //                 return;

    //             }
    //             System.out.println("Nama yang anda masukan salah! Masukan ulang!");
    //         }
    //     }
        
    // }
    public void dataPenyewa(){
        Scanner input = new Scanner(System.in);
        System.out.println("=======SELAMAT DATANG DI MAMIKOS=======");
        System.out.println("Silahkan Masukan Data Anda:");
        System.out.print("Nama\t\t:");
        String nama = input.nextLine();
        System.out.print("ID\t\t:");
        String idPenyewa = input.nextLine();
        System.out.print("Jenis Kelamin\t:");
        String jenisKelamin = input.nextLine();
        System.out.print("Alamat\t\t:");
        String alamat = input.nextLine();
        System.out.print("Email\t\t:");
        String email = input.nextLine();
        System.out.print("No Telp\t\t:");
        String noTelp = input.nextLine();
        
        Penyewa penyewaBaru = new Penyewa();

        penyewaBaru.setIdPenyewa(idPenyewa);
        penyewaBaru.setNama(nama);
        penyewaBaru.setJenisKelamin(jenisKelamin);
        penyewaBaru.setAlamat(alamat);
        penyewaBaru.setEmail(email);
        penyewaBaru.setNoTelp(noTelp);

        penyewas.put(penyewaBaru.getIdPenyewa(), penyewaBaru);
        lihatDaftarKamar();
    }

    public void lihatDaftarKamar() {
        System.out.println();
        System.out.println("===================Daftar Kamar===================");
        for (Map.Entry<String, Kamar> Kamar : kamars.entrySet()) {
            String key = Kamar.getKey();
            Kamar tKamar = Kamar.getValue();
            if (tKamar.isIsAvailable()) {
                System.out.println("No Kamar \t :" + key);
                System.out.println("Nama \t\t :" + tKamar.getJenisKamar());
                System.out.println("Harga \t\t :" + tKamar.getHargaKamar() + "/bulan");
                System.out.println("");
            }
        }
        System.out.println("====================================================");
    }

    public Kamar getKamar(String idKamar) {
        return kamars.get(idKamar);
    }

    public Penyewa getPenyewa(String idPenyewa) {
        return penyewas.get(idPenyewa);
    }

    public Owner getOwner(String idOwner) {
        return owners.get(idOwner);
    }

    public void sewa() {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<DetailKamar> tDetailKamars = new ArrayList<>();
        int increment = 0;
        String lanjut = "";
        try {
            do {
                increment++;
                System.out.println();
                System.out.print("Silahkan masukkan No Kamar\t: ");
                String NoKamar = input.readLine();
                System.out.print("Berapa bulan?\t: ");
                int jumlah = Integer.valueOf(input.readLine());

                DetailKamar dk = new DetailKamar();
                Kamar tKamar = getKamar(NoKamar);
                dk.setIdDetailKamar("dk" + increment);
                dk.setKamar(tKamar);
                dk.setHargaJual(tKamar.getHargaKamar());
                dk.setSubTotal(tKamar.getHargaKamar() * jumlah);
                tDetailKamars.add(dk);

            } while (lanjut.equalsIgnoreCase("Y"));
            System.out.println("");
            System.out.println("============Berikut Daftar Kamar Anda============");
            tampilkanDaftarKamar(tDetailKamars);
            System.out.println("TOTAL: " + hitungTotalKamar(tDetailKamars));
            BufferedReader inputKonfirmasi = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Konfirmasi Penyewaan (Y/N)?");
            String konfirm = "n";
            konfirm = inputKonfirmasi.readLine();
            if (konfirm.equalsIgnoreCase("y")) {
                Penyewaan penyewaan = new Penyewaan();
                penyewaan.setDetailKamars(tDetailKamars);
                penyewaan.setIdPenyewaan("P" + penyewaans.size() + 1);
                penyewaan.setPenyewa(getPenyewa("P1"));
                penyewaan.setOwner(getOwner("P1"));
                penyewaan.setTanggal(LocalDate.now());
                penyewaan.setTotal(hitungTotalKamar(tDetailKamars));
                penyewaans.add(penyewaan);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void tampilkanDaftarKamar(ArrayList<DetailKamar> dk) {
        for (DetailKamar detailKamar : dk) {
            System.out.println("No Kamar \t :" + detailKamar.getKamar().getIdKamar());
            System.out.println("Jenis Kamar \t :" + detailKamar.getKamar().getJenisKamar());
            System.out.println("Harga \t :" + detailKamar.getHargaJual()+ "/bulan");
            System.out.println("");
        }
    }

    public int hitungTotalKamar(ArrayList<DetailKamar> dk) {
        int total = 0;
        for (DetailKamar detailKamar : dk) {
            total += detailKamar.getSubTotal();
        }
        return total;
    }
    
    public void tampilkanLaporanPenyewaan() {
        for (Penyewaan penyewaan : penyewaans) {
            System.err.println();
            System.out.println("===================SEWA KOS MAMIKOS===================");
            System.out.println("No Penyewaan \t : "+penyewaan.getIdPenyewaan());
            System.out.println("Tanggal transaksi: "+penyewaan.getTanggal());
            System.out.println("Owner \t \t : "+penyewaan.getOwner().getNama());
            System.out.println("Penyewa \t : "+penyewaan.getPenyewa().getNama());
            System.out.println("======================================================");
            ArrayList<DetailKamar> detailKamars = penyewaan.getDetailKamars();
            for (DetailKamar dk : detailKamars) {
                System.out.println("No Kamar \t :" + dk.getKamar().getIdKamar());
                System.out.println("Jenis Kamar \t :" + dk.getKamar().getJenisKamar());
                System.out.println("Harga \t\t :" + dk.getHargaJual()+ "/bulan");
            }
            System.out.println("======================================================");
            System.out.println("Total \t \t : "+penyewaan.getTotal());
        }
    }
}
