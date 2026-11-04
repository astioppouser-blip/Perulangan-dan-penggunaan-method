package latihan.perulangan.dan.penggunaan.method;


public class LatihanKeEmpat {

    public static void tampilkanDaftarBarang(String namaBarang, int jumlahBeli) {

        System.out.println("\nDaftar Barang yang Dibeli:");

        for (int i = 1; i <= jumlahBeli; i++) {
            System.out.println("Barang ke-" + i + ": " + namaBarang);
        }
    }

    public static void main(String[] args) {

        String namaBarang = "Buku";
        int jumlahBeli = 3;

        System.out.println("Pembelian berhasil");

        tampilkanDaftarBarang(namaBarang, jumlahBeli);
    }
}
