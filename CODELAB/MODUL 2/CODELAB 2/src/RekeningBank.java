// Kelas RekeningBank
public class RekeningBank {
    // Atribut untuk menyimpan informasi rekening
    String nomorRekening; // Nomor rekening pemilik
    String namaPemilik;   // Nama pemilik rekening
    double saldo;         // Saldo dalam rekening

    // Method untuk menampilkan informasi rekening
    public void tampilkanInfo() {
        System.out.println("Nomor Rekening: " + nomorRekening);
        System.out.println("Nama Pemilik: " + namaPemilik);
        System.out.println("Saldo: Rp " + saldo);
    }

    // Method untuk menyetor uang ke rekening
    public void setorUang(double jumlah) {
        saldo += jumlah; // Menambahkan jumlah ke saldo
        System.out.println(namaPemilik + " menyetor Rp" + jumlah + " Saldo sekarang: Rp" + saldo );
        System.out.println(" "); // Memberikan jarak untuk tampilan yang lebih rapi
    }

    // Method untuk menarik uang dari rekening
    void tarikUang(double jumlah) {
        if (jumlah > saldo) {
            // Jika saldo tidak mencukupi, transaksi gagal
            System.out.println(namaPemilik + " menarik Rp" + jumlah + " (gagal, saldo tidak mencukupi) saldo saat ini: Rp" + saldo);
        } else {
            saldo -= jumlah; // Mengurangi jumlah dari saldo
            System.out.println(namaPemilik + " menarik Rp" + jumlah + " (berhasil) saldo sekarang : Rp " + saldo);
        }
    }
}