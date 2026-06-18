package bagian1.berkas;

import java.io.File;
import java.io.IOException;

public class LatihanMandiriStreamdanFile {
    public static void main(String[] args) {
        
        System.out.println("--- Jawaban Latihan 1.4 No. 1 ---");
        // Menggunakan blok { } agar variabel 'berkas' bisa digunakan kembali di nomor 3
        {
            File berkas = new File("laporan.txt");
            if (berkas.exists()) {
                System.out.println("Berkas ada, ukuran: " + berkas.length() + " byte");
            } else {
                System.out.println("Berkas laporan.txt tidak ditemukan.");
            }
        }

        System.out.println("\n--- Jawaban Latihan 1.4 No. 2 ---");
        {
            // Membuat folder baru bernama arsip menggunakan method mkdir()
            File folder = new File("arsip");
            if (folder.mkdir()) {
                System.out.println("Folder 'arsip' berhasil dibuat.");
            } else {
                System.out.println("Gagal membuat folder 'arsip' (mungkin folder sudah ada).");
            }
        }

        System.out.println("\n--- Jawaban Latihan 1.4 No. 3 ---");
        {
            File berkas = new File("sementara.txt");
            try {
                berkas.createNewFile();
                System.out.println("Sebelum dihapus, ada? " + berkas.exists());
                berkas.delete();
                System.out.println("Sesudah dihapus, ada? " + berkas.exists());
            } catch (IOException e) {
                System.out.println("Kesalahan: " + e.getMessage());
            }
        }
        
    }
}