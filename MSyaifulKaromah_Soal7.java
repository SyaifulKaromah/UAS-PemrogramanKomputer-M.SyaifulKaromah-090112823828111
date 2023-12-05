import java.util.ArrayList;
import java.util.Scanner;

class Buku {
   private String judul;
   private String penulis;
   private int tahunTerbit;
   private boolean tersedia;
   private int nomorPeminjaman;

   public Buku(String judul, String penulis, int tahunTerbit, boolean tersedia, int nomorPeminjaman) {
      this.judul = judul;
      this.penulis = penulis;
      this.tahunTerbit = tahunTerbit;
      this.tersedia = tersedia;
      this.nomorPeminjaman = nomorPeminjaman;
   }

   public void tampilkanInfo() {
      System.out.println("Nomor Peminjaman: " + nomorPeminjaman);
      System.out.println("Judul: " + judul);
      System.out.println("Penulis: " + penulis);
      System.out.println("Tahun Terbit: " + tahunTerbit);
      System.out.println("Status: " + (tersedia ? "Tersedia" : "Dipinjam"));
      System.out.println();
   }

   public void pinjamBuku() {
      if (tersedia) {
         tersedia = false;

         System.out.println("------------------------------------------");
         System.out.println("Buku berhasil dipinjam. Nomor Peminjaman: " + nomorPeminjaman);
         System.out.println("------------------------------------------");
      } else {
         System.out.println("------------------------------------------");
         System.out.println("Maaf, buku sedang tidak tersedia.");
         System.out.println("------------------------------------------");
      }
   }

   public int getNomorPeminjaman() {
      return nomorPeminjaman;
   }
}

public class MSyaifulKaromah_Soal7 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      ArrayList<Buku> daftarBuku = new ArrayList<>();
      daftarBuku.add(new Buku("Java Programming", "John Smith", 2020, true, 1));
      daftarBuku.add(new Buku("Data Structures and Algorithms", "Alice Johnson", 2019, false, 2));
      daftarBuku.add(new Buku("Introduction to AI", "Robert Williams", 2022, true, 3));
      daftarBuku.add(new Buku("Database Management", "Emily Davis", 2018, true, 4));
      daftarBuku.add(new Buku("Web Development", "Michael Brown", 2021, true, 5));

      // Menampilkan informasi semua buku sebelum dipinjam
      System.out.println("Informasi Semua Buku Sebelum Dipinjam:");
      for (Buku buku : daftarBuku) {
         buku.tampilkanInfo();
      }

      System.out.println("------------------------------------------");

      // Meminjam buku
      System.out.print("Masukkan nomor peminjaman buku yang ingin dipinjam: ");
      int nomorPeminjaman = scanner.nextInt();
      boolean bukuDitemukan = false;

      for (Buku buku : daftarBuku) {
         if (bukuDitemukan) {
            break;
         }

         if (buku.getNomorPeminjaman() == nomorPeminjaman) {
            buku.pinjamBuku();
            bukuDitemukan = true;
         }
      }

      if (!bukuDitemukan) {
         System.out.println("------------------------------------------");
         System.out.println("Nomor peminjaman tidak valid.");
      }

      // Menampilkan informasi semua buku setelah dipinjam
      System.out.println("\nInformasi Semua Buku Setelah Dipinjam:");
      for (Buku buku : daftarBuku) {
         buku.tampilkanInfo();
      }

      scanner.close();
   }
}
