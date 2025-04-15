
import java.time.LocalDate; // mengimmpor kelas localdate untuk mendapat tahun saat ini
import java.util.Scanner; // mengimpor kelas scanner untuk mengambil input dari pengguna

public class Modul1 {
  public static void main(String[] args){ //  mendeklarasikan variabel untuk menyimpan informasi pengguna
    String name; // variabel untuk menyimpan nama pengguna
    char gender; // variabel untuk menyimpan jenis kelamin pemgguna
    int tahunlahir; //variabel untuk menyimpan tahun lahir pengguna

    Scanner objInput = new Scanner(System.in); //membuat objek scanner untuk mengambil input dari pengguna

    //mengambil input dari pengguna
    System.out.print("MASUKKAN NAMA ANDA = ");
    name = objInput.nextLine();
    System.out.print("MASUKKAN JENIS KELAMIN ANDA (P/L) = ");
    gender = objInput.next().charAt(0);
    System.out.print("MASUKKAN TAHUN LAHIR ANDA = ");
    tahunlahir = objInput.nextInt();

    int tahunsekarang = LocalDate.now().getYear();// mengambil tahun sekarang menggunakan kelas localdate
    int umur = tahunsekarang - tahunlahir; //menghitung umnur pengguna dengan mengurangi tahun lahir dari tahun sekarang

    //menampilkan data diri berdasarkan input dari pengguna
    if( gender == 'L' || gender =='l'){
      System.out.print("\nData diri = \nNama     = " +name + "\nJenis kelamin = Laki-Laki \nUmur   = " + umur);
    } else if (gender == 'P'|| gender == 'p'){
      System.out.print("\nData diri = \nNama     = " +name + "\nJenis kelamin = Perempuan \nUmur   = "  + umur);
    } else {
      System.out.println("masukkan gender sesuai pilihan (P/L");
    }

  }
}