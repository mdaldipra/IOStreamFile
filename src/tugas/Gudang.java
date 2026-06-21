package tugas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Gudang {
    // ArrayList yang menampung objek bertipe Barang
    private ArrayList<Barang> daftarBarang = new ArrayList<>();
    private String namaBerkas;

    public Gudang(String namaBerkas) {
        this.namaBerkas = namaBerkas;
    }

    // Menambah satu barang ke koleksi
    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    // Menampilkan seluruh koleksi beserta nomor urut
    public void tampilkanSemua() {
        System.out.println("== Daftar Barang ==");
        for (int i = 0; i < daftarBarang.size(); i++) {
            Barang b = daftarBarang.get(i);
            System.out.println((i + 1) + ". " + b.info());
        }
    }

    // Menyimpan seluruh barang ke berkas, satu barang per baris
    public void simpanKeBerkas() {
        try (PrintWriter penulis = new PrintWriter(new FileWriter(namaBerkas))) {
            for (Barang b : daftarBarang) {
                penulis.println(b.keBaris());
            }
            System.out.println("Data disimpan ke berkas: " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal menyimpan: " + e.getMessage());
        }
    }

    // Membaca kembali barang dari berkas ke dalam ArrayList
    public void muatDariBerkas() {
        daftarBarang.clear();
        try (BufferedReader pembaca = new BufferedReader(new FileReader(namaBerkas))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                String[] bagian = baris.split(";");
                if (bagian.length == 3) {
                    // Konversi String ke tipe data yang sesuai
                    String nama = bagian[0];
                    double harga = Double.parseDouble(bagian[1]);
                    int stok = Integer.parseInt(bagian[2]);
                    
                    daftarBarang.add(new Barang(nama, harga, stok));
                }
            }
            System.out.println("Data dimuat dari berkas: " + namaBerkas);
        } catch (IOException e) {
            System.out.println("Gagal memuat: " + e.getMessage());
        }
    }

    // Menjumlahkan harga dikali stok dari seluruh barang
    public double totalNilai() {
        double total = 0;
        for (Barang b : daftarBarang) {
            total += (b.getHarga() * b.getStok());
        }
        return total;
    }
}