import java.util.Scanner;

class CetakNamaDanUmur {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    String nama = input.nextLine();// isi nama
    int tahun = input.nextInt();//isi tahun lahir 
    int usia = 2020-tahun;//usia
    
    System.out.printf("%s (%d tahun)", nama, usia);
    }
}