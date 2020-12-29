import java.util.Scanner;

class KurangBagusSangatBagus {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int nilai = input.nextInt();
    
    if ( nilai > 75 ) {
      System.out.println("Sangat Bagus");
    } else if ( nilai > 54 ) {
      System.out.println("Bagus");
    } else {
      System.out.println("Kurang");
    }
    
  }
}