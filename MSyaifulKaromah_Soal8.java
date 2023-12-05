import java.util.Scanner;

public class MSyaifulKaromah_Soal8 {
   public static void main(String[] args) {
      String usrData = "SYF";
      String pwData = "123456";
      boolean isActive = true;

      // Login
      Scanner key = new Scanner(System.in);
      System.out.print("Masukkan Username: ");
      String usrIn = key.nextLine();
      System.out.print("Masukkan Password: ");
      String pwIn = key.nextLine();

      // Autentikasi
      if (usrIn.equals(usrData) && pwIn.equals(pwData)) {
         System.out.println("Autentikasi Berhasil");

         // Tampilkan status aktif/nonaktif
         System.out.println("Status Akun: " + (isActive ? "Aktif" : "Nonaktif"));

         System.out.print("Apakah Anda ingin mengubah status? (y/n): ");
         char menuChoice = key.next().charAt(0);

         if (menuChoice == 'y' || menuChoice == 'Y') {
            isActive = !isActive; // Ubah status
            System.out.println("Status Akun berhasil diubah menjadi " + (isActive ? "Aktif" : "Nonaktif"));
         } else if (menuChoice == 'n' || menuChoice == 'N') {
            System.out.println("Operasi dibatalkan");
         } else {
            System.out.println("Pilihan tidak valid");
         }
      } else {
         System.out.println("Autentikasi Gagal");
      }

      key.close();
   }
}
