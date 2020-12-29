import java.util.*;
class GanjilGenap {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int angka = input.nextInt();
  
  if ( angka % 2 == 0) {
  System.out.println("Genap");
  } else {
    System.out.println("Ganjil");
  }
  }
}