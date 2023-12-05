import java.util.Scanner;

public class MSyaifulKaromah_Soal4 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Masukkan bilangan bulat positif: ");
      int bilangan = scanner.nextInt();

      // Tampilkan
      System.out.print("Faktorisasi " + bilangan + ": ");

      for (int i = 2; i <= bilangan; i++) {
         while (bilangan % i == 0) {
            System.out.print(i);
            bilangan /= i;
            if (bilangan > 1) {
               System.out.print(" * ");
            }
         }
      }

      System.out.println();

      scanner.close();
   }

}
