import java.util.Scanner; // api inputan user

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //membuat objek scanner untuk mendapatkan input dari pengguna

        // 1. Menampilkan pilihan login
        System.out.println("Pilih jenis login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan: ");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer agar tidak terjadi error saat membaca input selanjutnya

        if (pilihan == 1) {
            // Login Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();


            String nimTigaDigitTerakhir = "218"; // data login admin
            String validUsername = "Admin" + nimTigaDigitTerakhir;
            String validPassword = "password" + nimTigaDigitTerakhir;

            if (username.equals(validUsername) && password.equals(validPassword)) { //verifikasi login admin
                System.out.println("Login Admin berhasil!");
            } else {
                System.out.println("Login gagal! Username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Login Mahasiswa
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();


            String validNama = "HAIDAR HANIF WAHYUDI"; //data login
            String validNim = "202410370110100";

            if (nama.equals(validNama) && nim.equals(validNim)) {  // verifikasi login mahasiswa
                System.out.println("Login Mahasiswa berhasil!");
                System.out.println("Nama: " + nama);
                System.out.println("NIM: " + nim);
            } else {
                System.out.println("Login gagal! Nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close(); //menutup scanner
    }
}