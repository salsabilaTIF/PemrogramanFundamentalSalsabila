import java.util.Scanner;

class MenghitungJumlahPerbaris {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    
    int matrix[][] = new int[5][5];
    
    for (int b = 0; b < 5; b++){
      for (int k = 0; k < 5; k++){
        matrix[b][k] = n.nextInt();
      }
    }
    int res = 0;
    for (int b = 0; b < 5; b++){
      for (int k = 0; k < 5; k++){
        res += matrix[b][k];
      
      }
      System.out.println(res);
      res = 0;
    }
    
  }
}