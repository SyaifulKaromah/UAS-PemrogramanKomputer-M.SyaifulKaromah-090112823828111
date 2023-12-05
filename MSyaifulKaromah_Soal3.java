import java.util.Scanner;

public class MSyaifulKaromah_Soal3 {
   public static void main(String[] args) {
      Scanner key = new Scanner(System.in);

      System.out.print("Masukkan jumlah suku: ");
      int n = key.nextInt();

      System.out.println("Deret Fibonacci hingga suku ke-" + n + " adalah:");
      for (int i = 0; i < n; i++) {
         System.out.print(fibonacci(i) + ", ");
      }

      key.close();
   }

   public static int fibonacci(int n) {
      if (n <= 1) {
         return n;
      } else {
         return fibonacci(n - 1) + fibonacci(n - 2);
      }
   }
}
