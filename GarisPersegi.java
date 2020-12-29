import java.util.*;

class GarisPersegi {
  public static void main(String[] args) {
    
  Scanner input = new Scanner(System.in);
  int z = input.nextInt();
  for (int i = 1; i <= z; i++){
    for (int j = 0; j <= z; j++){
      if (i == 0 || i == z-1){
        System.out.print("#");
        
        }else if(j == 0 || j == z-1){
        System.out.print("#");
        
        }else {
          System.out.print(" ");
        }
      System.out.println();
    }
  }
}
}