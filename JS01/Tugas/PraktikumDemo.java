;

public class PraktikumDemo {
  public static void main(String[] args) {
    Buku buku1 = new Buku();
    BukuNovel buku2 = new BukuNovel();
    BukuSekolah buku3 = new BukuSekolah();
    Hp hp1 = new Hp();
    Tas tas1 = new Tas();

    buku1.setJudul("Kapan Nanti");
    buku1.setJenis("Novel");
    buku1.setPenerbit("ziggy zezsyazeoviennazabrizki");
    buku1.setTahunTerbit(2023);
    buku1.setJumlah(15);
    buku1.tambahBuku(5);
    buku1.info();
    System.out.println("---------------------------------------");

    buku2.setJudul("Laskar Pelangi");
    buku2.setJenis("Novel");
    buku2.setPenerbit("James John");
    buku2.setTahunTerbit(2010);
    buku2.setJumlah(10);
    buku2.setKategori("Hiburan");
    buku2.setHalaman(100);
    buku2.info();
    System.out.println("---------------------------------------");

    buku3.setJudul("Hukum Newton (FISIKA)");
    buku3.setJenis("Buku Sekolah");
    buku3.setPenerbit("James John");
    buku3.setTahunTerbit(2007);
    buku3.setJumlah(5);
    buku3.setBukuKelas(12);
    buku3.setJenjang("SMA");
    buku3.info();
    System.out.println("---------------------------------------");

    
  }
}