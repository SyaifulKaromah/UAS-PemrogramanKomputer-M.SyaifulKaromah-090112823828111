import java.util.*;

public class MSyaifulKaromah_Soal1 {
   public static void main(String[] args) {
      Scanner key = new Scanner(System.in);

      System.out.print("Masukkan harga barang: ");
      int prc = key.nextInt();

      System.out.print("Masukkan jumlah pembelian: ");
      int qty = key.nextInt();

      double jumlah = prc * qty;
      double total = 0;

      if (qty < 5) {
         total = jumlah; // Tidak ada diskon
      } else if (qty >= 5 && qty <= 10) {
         double dis = 0.05 * jumlah;
         total = jumlah - dis; // Diskon 5%
      } else if (qty >= 11 && qty <= 20) {
         double dis = 0.1 * jumlah;
         total = jumlah - dis; // Diskon 10%
      } else {
         double dis = 0.2 * jumlah;
         total = jumlah - dis; // Diskon 20%
      }

      System.out.println("Total harga setelah diskon: " + total);

      key.close();
   }
}
