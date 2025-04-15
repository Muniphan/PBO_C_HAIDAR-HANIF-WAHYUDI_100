private abstract class KarakterGame {


    //atribut private untuk menyimpan nama dan kesehatan karakter
    private String nama;
    private int kesehatan ;
    //constuktor
    public KarakterGame(String nama, int kesehatan){
        this.nama = nama;
        this.kesehatan = kesehatan;
    }
    // getter untuk mendapatkan nama karakter
    public String getNama(){
        return nama;

    }
    // setter untuk mengubah nama karakter
    public void setNama(String nama){
        this.nama = nama;
    }
    //getter untuk mendapatkan nilai kesehatan
    public int getKesehatan(){
        return kesehatan;
    }
    //setter untuk mengubah nilai kesehatan

    public void setKesehatan(int kesehatan) {
        this.kesehatan = kesehatan;
    }
    //method unutk menyerang karakter
    public void serang(Musuh target){
        System.out.println(nama + "menyeranf" + target.getNama());
    }

    public abstract void serang(KarakterGame target);
}
