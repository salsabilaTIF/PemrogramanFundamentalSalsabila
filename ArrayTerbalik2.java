import java.util.*;

class ArrayTerbalik2 {
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  int qwerty = input.nextInt();
  int jumlah[] = new int[qwerty];
  
  for  (int y = 0; y < jumlah.length; y++) {
    jumlah[y] = input.nextInt();
  }
  for (int z = qwerty - 1; z >= 0; z--) {
    
    System.out.println(jumlah[z]);
  }
  }
}