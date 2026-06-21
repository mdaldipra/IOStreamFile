package bagian2.bacatulis;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class LatihanMandiriBacaTulis {
    public static void main(String[] args) {

        System.out.println("--- Jawaban Latihan 2.4 No. 1 ---");
        // Menulis 5 nama hari, lalu baca kembali dan tampilkan ke layar
        String[] hari = {"Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt"))) {
            for (String h : hari) {
                penulis.println(h);
            }
            System.out.println("Data berhasil ditulis ke hari.txt.");
        } catch (IOException e) {
            System.out.println("Gagal menulis: " + e.getMessage());
        }
        
        System.out.println("\nIsi berkas saat ini:");
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }


        System.out.println("\n--- Jawaban Latihan 2.4 No. 2 ---");
        // Menambahkan (append) 2 nama hari lagi ke berkas hari.txt tanpa menghapus isi sebelumnya
        try (PrintWriter penulis = new PrintWriter(new FileWriter("hari.txt", true))) {
            penulis.println("Sabtu");
            penulis.println("Minggu");
            System.out.println("Dua nama hari baru ditambahkan tanpa menghapus data lama.");
        } catch (IOException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
        
        System.out.println("\nSeluruh isi berkas setelah ditambah:");
        // Tampilkan seluruh isinya setelah proses penambahan (append) [cite: 189]
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            String baris;
            while ((baris = pembaca.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }


        System.out.println("\n--- Jawaban Latihan 2.4 No. 3 ---");
        // Baca berkas hari.txt lalu hitung jumlah baris yang ada di dalamnya
        int jumlah = 0;
        try (BufferedReader pembaca = new BufferedReader(new FileReader("hari.txt"))) {
            while (pembaca.readLine() != null) {
                jumlah++;
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca: " + e.getMessage());
        }
        System.out.println("Jumlah baris: " + jumlah);

    }
}