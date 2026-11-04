package latihan.perulangan.dan.penggunaan.method;


public class LatihanPertama {
    public static void main(String[] args) {

        System.out.println("Nomor Barang 1 sampai 10:");

        for (int i = 1; i <= 10; i++) {
            System.out.println("Barang ke-" + i);
        }

        System.out.println("\nNomor Barang 10 sampai 1:");

        for (int i = 10; i >= 1; i--) {
            System.out.println("Barang ke-" + i);
        }
    }
}
