import java.util.*;

class ArrayTerbalik {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int qwerty[] = new int[5];
    for (int z = 0; z < qwerty.length; z++) {
      qwerty[z] = input.nextInt();
    }
    for (int z = 4; z >= 0; z--) {
    System.out.println(qwerty[z]);
    }
  }
}