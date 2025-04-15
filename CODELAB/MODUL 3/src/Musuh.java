class Musuh extends KarakterGame { //merupakan subclass dari karakterGame
    public Musuh(String nama, int kesehatan) {//constuctor
        super(nama, kesehatan);
    }

    @Override
    public void serang(KarakterGame target){
        System.out.println(getNama() + " menyerang " + target.getNama() + " Menggunakan Snake Bite!");
        target.setKesehatan(target.getKesehatan() - 15);
        System.out.println(target.getNama() + " Sekarang memiliki kesehatan " + target.getKesehatan());
    }
}