import java.util.Scanner;
class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menyediakan pilihan login sebagai Admin atau Mahasiswa
        System.out.println("Pilih login sebagai: 1. Admin  2. Mahasiswa");
        int pilihan = scanner.nextInt();
        scanner.nextLine(); // Membersihkan buffer

        if (pilihan == 1) {
            // Input username dan password untuk Admin
            System.out.print("Masukkan username: ");
            String username = scanner.nextLine();
            System.out.print("Masukkan password: ");
            String password = scanner.nextLine();

            // Membuat objek Admin dan melakukan login
            Admin admin = new Admin("HAIDAR HANIF WAHYUDI", "202410370110100", "admin218", "password218");
            if (admin.login(username, password)) {
                admin.displayInfo();
            } else {
                System.out.println("Login gagal, username atau password salah.");
            }
        } else if (pilihan == 2) {
            // Input nama dan NIM untuk Mahasiswa
            System.out.print("Masukkan nama: ");
            String nama = scanner.nextLine();
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            // Membuat objek Mahasiswa dan melakukan login
            Mahasiswa mahasiswa = new Mahasiswa("HAIDAR HANIF WAHYUDI", "202410370110100");
            if (mahasiswa.login(nama, nim)) {
                mahasiswa.displayInfo();
            } else {
                System.out.println("Login gagal, nama atau NIM salah.");
            }
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close();
    }
}