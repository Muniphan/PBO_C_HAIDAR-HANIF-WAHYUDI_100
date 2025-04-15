class User {
    private String nama = "HAIDAR HANIF WAHYUDI" + "HAIDAR HANIF WAHYUDI";
    private String nim = "202410370110100";

    // Constructor untuk inisialisasi nama dan nim
    public User(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Getter dan setter untuk atribut nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter dan setter untuk atribut nim
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    // Method login() yang akan dioverride oleh subclass
    public boolean login(String inputNama, String inputNim) {
        return false;
    }

    // Method untuk menampilkan informasi pengguna
    public void displayInfo() {
        System.out.println("User Information");
    }
}