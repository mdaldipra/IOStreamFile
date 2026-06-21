package bagian3.kontak;

public class Kontak {
    // Atribut: data yang dimiliki setiap kontak
    private String nama;
    private String nomor;
    private String email; // Tambahan atribut email (Jawaban No. 2)
    
    // Constructor: dipanggil saat objek dibuat (ditambahkan parameter email)
    public Kontak(String nama, String nomor, String email) {
        this.nama = nama;
        this.nomor = nomor;
        this.email = email;
    }

    // Getter: cara membaca atribut dari luar class
    public String getNama() {
        return nama;
    }

    public String getNomor() {
        return nomor;
    }

    public String getEmail() { // Tambahan getter email
        return email;
    }

    // Mengubah objek menjadi satu baris teks untuk disimpan ke berkas
    public String keBaris() {
        // Pemisah titik koma (;) disesuaikan menjadi 3 bagian
        return nama + ";" + nomor + ";" + email;
    }

    // Mengembalikan keterangan kontak dalam bentuk teks
    public String info() {
        // Tampilan disesuaikan untuk menampilkan email
        return nama + " - " + nomor + " - " + email;
    }
}