import java.util.*;

public class ManajemenStock {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Barang> daftar = new ArrayList<>();
        boolean jalan = true;

        while (jalan) {
            System.out.println("\n===== Menu Manajemen Stok =====");
            System.out.println("1. Tambah Barang Baru");
            System.out.println("2. Tampilkan Semua Barang");
            System.out.println("3. Kurangi Stok Barang");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");

            int opsi ;
            try {
                opsi = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Input harus angka!");
                input.nextLine();
                continue;
            }
            switch (opsi) {
                case 1:
                    try {
                        System.out.print("Masukkan nama barang: ");
                        String nama = input.nextLine();
                        System.out.print("Masukkan stok awal: ");
                        int stok = input.nextInt();
                        input.nextLine();
                        daftar.add(new Barang(nama, stok));
                        System.out.println("Barang '" + nama + "' berhasil ditambahkan.");
                    } catch (InputMismatchException e) {
                        System.out.println("Input stok harus berupa angka!");
                        input.nextLine();
                    }
                    break;

                case 2:
                    System.out.println("\n--- Daftar Barang ---");
                    if (daftar.isEmpty()) {
                        System.out.println("Stok barang kosong.");
                    } else {
                        for (int i = 0; i < daftar.size(); i++) {
                            Barang b = daftar.get(i);
                            System.out.println(i + ". Nama: " + b.getNama() + ", Stok: " + b.getStok());
                        }
                    }
                    break;
                case 3:
                    if (daftar.isEmpty()) {
                        System.out.println("Belum ada barang.");
                        break;
                    }

                    System.out.println("\n--- Daftar Barang (Kurangi Stok) ---");
                    for (int i = 0; i < daftar.size(); i++) {
                        Barang b = daftar.get(i);
                        System.out.println(i + ". " + b.getNama() + " (Stok: " + b.getStok() + ")");
                    }

                    try {
                        System.out.print("Masukkan nomor indeks: ");
                        int i = input.nextInt();
                        System.out.print("Masukkan jumlah stok yang akan diambil: ");
                        int j = input.nextInt();
                        input.nextLine();

                        Barang b = daftar.get(i);
                        if (j > b.getStok()) {
                            throw new StokTidakCukupException("Stok untuk '" + b.getNama() + "' hanya tersisa " + b.getStok() + ".");
                        }
                        b.setStok(b.getStok() - j);
                        System.out.println("Stok barang '" + b.getNama() + "' berhasil dikurangi. Sisa stok: " + b.getStok());
                    } catch (InputMismatchException e) {
                        System.out.println("Input harus angka woy!");
                        input.nextLine();
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Indeks tidak valid!");
                    } catch (StokTidakCukupException e) {
                        System.out.println(e.getMessage());
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih! Program berakhir.");
                    jalan = false;
                    break;

                default:
                    System.out.println("Opsi tidak tersedia.");
            }
        }

        input.close();
    }
}
