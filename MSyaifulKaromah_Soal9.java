import java.util.Scanner;
import java.util.Stack;

public class MSyaifulKaromah_Soal9 {

   static boolean cekKurung(String Input) {
      Stack<Character> stack = new Stack<>();

      for (int i = 0; i < Input.length(); i++) {
         char newChar = Input.charAt(i);

         if (newChar == '(' || newChar == '{' || newChar == '[') {
            stack.push(newChar);
         } else if (newChar == ')' || newChar == '}' || newChar == ']') {
            if (stack.isEmpty()) {
               return false;
            }

            char topChar = stack.pop();

            if ((newChar == ')' && topChar != '(') ||
                  (newChar == '}' && topChar != '{') ||
                  (newChar == ']' && topChar != '[')) {
               return false;
            }
         }
      }

      return stack.isEmpty();
   }

   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);

      System.out.print("Masukkan ekspresi matematika: ");
      String userInput = scanner.nextLine();

      if (cekKurung(userInput)) {
         System.out.println(userInput + " : Kurung seimbang");
      } else {
         System.out.println(userInput + " : Kurung tidak seimbang");
      }

      scanner.close();
   }
}
