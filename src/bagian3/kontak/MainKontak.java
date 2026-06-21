package bagian3.kontak;

public class MainKontak {
    public static void main(String[] args) {
        // Membuat objek pengelola dan mengisinya
        BukuKontak buku = new BukuKontak("kontak.txt");
        
        // Penyesuaian No. 2: Objek kontak diisi dengan 3 parameter (termasuk email)
        buku.tambahKontak(new Kontak("Andi", "0811111", "andi@email.com"));
        buku.tambahKontak(new Kontak("Budi", "0822222", "budi@email.com"));
        buku.tambahKontak(new Kontak("Citra", "0833333", "citra@email.com"));
        
        buku.tampilkanSemua();
        buku.simpanKeBerkas();

        System.out.println("\n-- Uji Coba Latihan 3.4 --");
        
        // Pengujian Jawaban No. 1 (Method cariKontak)
        buku.cariKontak("Budi");
        buku.cariKontak("Zaki"); // Contoh kontak yang tidak ada

        // Pengujian Jawaban No. 3 (Method hapusKontak)
        buku.hapusKontak("Andi"); 
        
        System.out.println();

        // Objek baru yang kosong, lalu memuat dari berkas
        BukuKontak bukuLain = new BukuKontak("kontak.txt");
        bukuLain.muatDariBerkas();
        bukuLain.tampilkanSemua();
        
        // Output jumlah akan berkurang karena "Andi" sudah dihapus
        System.out.println("Jumlah kontak: " + bukuLain.jumlahKontak()); 
    }
}