// Nama: Muhammad Aldi Saputra
// NPM : 2410010507

package tugas;

public class MainTugas {
    public static void main(String[] args) {
        
        // 1. Menyimpan daftar nama kategori dalam array String dan menampilkannya
        String[] kategoriToko = {"Elektronik", "Pakaian", "Peralatan Rumah Tangga", "Alat Tulis"};
        System.out.println("== Kategori Tersedia ==");
        for (String k : kategoriToko) {
            System.out.println("- " + k);
        }
        System.out.println();

        // Membuat objek Gudang pertama untuk menyimpan data awal
        Gudang gudangSatu = new Gudang("barang.txt");

        // Menambah minimal 5 objek Barang sesuai daftar kategori
        gudangSatu.tambahBarang(new Barang("Laptop Asus (Elektronik)", 8500000.0, 10));
        gudangSatu.tambahBarang(new Barang("Kemeja Flanel (Pakaian)", 150000.0, 20));
        gudangSatu.tambahBarang(new Barang("Blender Philips (Peralatan RT)", 450000.0, 15));
        gudangSatu.tambahBarang(new Barang("Buku Sinar Dunia (Alat Tulis)", 45000.0, 50));
        gudangSatu.tambahBarang(new Barang("Mouse Wireless (Elektronik)", 185000.0, 30));

        // Menampilkan seluruh barang dan menyimpannya ke berkas
        gudangSatu.tampilkanSemua();
        gudangSatu.simpanKeBerkas();

        System.out.println("\n-------------------------------------------------\n");

        // 3. Membuat objek Gudang BARU, memuat kembali dari berkas
        Gudang gudangDua = new Gudang("barang.txt");
        gudangDua.muatDariBerkas();
        
        // Menampilkannya untuk membuktikan data tersimpan
        gudangDua.tampilkanSemua();

        // Menampilkan total nilai persediaan (Menggunakan printf agar tidak muncul notasi "E")
        System.out.printf("\nTotal Nilai Persediaan: Rp%.0f\n", gudangDua.totalNilai());
    }
}