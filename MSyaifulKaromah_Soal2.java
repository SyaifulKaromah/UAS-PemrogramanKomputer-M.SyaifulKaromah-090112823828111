import java.util.Scanner;

public class MSyaifulKaromah_Soal2 {
   public static void main(String[] args) {
      // Asumsikan username dan password
      String usrData = "SYF";
      String pwData = "123456";

      // Login
      Scanner key = new Scanner(System.in);
      System.out.print("Masukkan Username: ");
      String usrIn = key.nextLine();
      System.out.print("Masukkan Password: ");
      String pwIn = key.nextLine();
      key.close();

      // Autentikasi
      if (usrIn.equals(usrData) && pwIn.equals(pwData)) {
         System.out.println("Autentikasi Berhasil");
      } else {
         System.out.println("Autentikasi Gagal");
      }
   }
}
