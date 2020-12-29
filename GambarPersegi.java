import java.util.*;
class GambarPersegi {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int angka = input.nextInt();
  
  for (int i = 0; i < angka; i++) {
    for (int j = 0; j < angka; j++) {
    System.out.print("*");
    }
    System.out.println("");
  }
  }
}