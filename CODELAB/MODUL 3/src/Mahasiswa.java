class Mahasiswa extends User {
    // Constructor Mahasiswa dengan super untuk inisialisasi User
    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    // Override method login untuk validasi nama dan nim
    @Override
    public boolean login(String inputNama, String inputNim) {
        return this.getNama().equals(inputNama) && this.getNim().equals(inputNim);
    }

    // Override method displayInfo untuk menampilkan pesan login sukses
    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa sukses. ");
    }
}