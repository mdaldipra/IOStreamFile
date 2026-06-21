package tugas;

public class Barang {
    private String nama;
    private double harga;
    private int stok;

    // Constructor untuk menginisialisasi objek saat dibuat
    public Barang(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    // Getter untuk membaca atribut dari luar class
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // Mengubah objek menjadi satu baris teks dengan pemisah ";" untuk disimpan ke berkas
    public String keBaris() {
        return nama + ";" + harga + ";" + stok;
    }

    // Mengembalikan keterangan barang dalam bentuk teks untuk ditampilkan
    public String info() {
        return nama + " - Harga: Rp" + harga + " - Stok: " + stok;
    }
}