import java.util.Scanner;
public class BinaryDecimal {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a binary number:");
      String b = sc.next();
      int d = Integer.parseInt(b, 2);
      System.out.println("Decimal value of the given binary number is:"+d);
   }
}