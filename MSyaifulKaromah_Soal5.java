import java.util.Scanner;

public class MSyaifulKaromah_Soal5 {

   public static double tambah(double Num1, double Num2) {
      return Num1 + Num2;
   }

   public static double kurang(double Num1, double Num2) {
      return Num1 - Num2;
   }

   public static double kali(double Num1, double Num2) {
      return Num1 * Num2;
   }

   public static double bagi(double Num1, double Num2) {
      if (Num2 != 0) {
         return Num1 / Num2;
      } else {
         System.out.println("Pembagian oleh nol tidak diperbolehkan.");
         return Double.NaN;
      }
   }

   public static void main(String[] args) {
      Scanner key = new Scanner(System.in);

      System.out.print("Masukkan ekspresi matematika (contoh: 2+3): ");
      String userInput = key.nextLine();

      // Memecah input menjadi token
      String[] operasi = userInput.split("[-+*/]");

      // Menangkap masing-masing token
      double Num1 = Double.parseDouble(operasi[0]);
      char operator = userInput.charAt(operasi[0].length());
      double Num2 = Double.parseDouble(operasi[1]);

      // Concatenate user inputs
      String concatenatedInput = "Input: " + userInput;

      double hasil = 0;

      switch (operator) {
         case '+':
            hasil = tambah(Num1, Num2);
            break;
         case '-':
            break;
         case '*':
            hasil = kali(Num1, Num2);
            break;
         case '/':
            hasil = bagi(Num1, Num2);
            break;
         default:
            System.out.println("Operasi tidak valid.");
            break;
      }

      // Tampilkan
      System.out.println(concatenatedInput);
      System.out.println("Hasil: " + hasil);

      key.close();
   }
}
