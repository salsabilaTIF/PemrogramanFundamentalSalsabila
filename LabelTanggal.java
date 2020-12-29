import java.util.Scanner;
class LabelTanggal {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
        String[] month = {
                "Januari",
                "Februari",
                "Maret",
                "April",
                "Mei",
                "Juni",
                "Juli",
                "Agustus",
                "September",
                "Oktober",
                "November",
                "Desember",
        };

       
        
// input date
int date = input.nextInt();


// Input month
        
        int nomorMonth = input.nextInt();

        

        //input year
        int year = input.nextInt();
        
        //output
        System.out.println( date  + " " + month[nomorMonth-1]+ " "  +  year
        );
      
        
  }
}