import java.util.Scanner;

class SpesialSwitchCase {
  public static void main(String[] args) {
  
      Scanner input = new Scanner(System.in);
      int angka= input.nextInt();
      
      switch ( angka ) {
        case 1:
          System.out.println("Satu");
          System.out.println("Dua");
          System.out.println("Tiga");
          break;
        case 2:
          System.out.println("Dua");
          System.out.println("Tiga");
          break;
        case 3:
          System.out.println("Tiga");
          break;
        default:
          System.out.println("case 1");
          break;
      }
  }
}