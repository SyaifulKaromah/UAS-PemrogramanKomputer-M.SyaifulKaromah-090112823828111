import java.util.Scanner;

public class MSyaifulKaromah_Soal6 {
   public static void main(String[] args) {
      Scanner key = new Scanner(System.in);

      System.out.print("Masukkan kata atau frase: ");
      String input = key.nextLine();

      if (isPalindrome(input)) {
         System.out.println("'" + input + "' adalah palindrom.");
      } else {
         System.out.println("'" + input + "' bukan palindrom.");
      }

      key.close();
   }

   private static boolean isPalindrome(String str) {
      String cleanStr = str.replaceAll("\\s", "").toLowerCase();

      int length = cleanStr.length();
      for (int i = 0; i < length / 2; i++) {
         if (cleanStr.charAt(i) != cleanStr.charAt(length - 1 - i)) {
            return false;
         }
      }
      return true;
   }
}
