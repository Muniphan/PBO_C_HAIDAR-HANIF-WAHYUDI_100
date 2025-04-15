class Pahlawan extends KarakterGame{
    public Pahlawan(String nama,int kesehatan){
        super(nama,kesehatan);
    }// class pahlawan adalah subclass dari karakter game

    @Override
    public void serang(Musuh target){ //overide menthod untuk memberikan serangan
        System.out.println(getNama() + "menyerang" + target.getNama() + "menggunakan orbital strike!");
        target.setNama(target.getKesehatan() - 20);
        System.out.println(target.getnama() + "sekarang memiliki kesehatan " + target.getKesehatan());
    }
}