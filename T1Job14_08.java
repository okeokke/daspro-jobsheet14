import java.util.Scanner;
public class T1Job14_08 {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {
    System.out.print("Masukkan jumlah angka yang ingin dihitung (N): ");
    int n = sc.nextInt();

    System.out.println("--Rekursif--");
    int hasil = totalRekursif(n);
    System.out.println("Total dari "+n+" angka yang dimasukkan adalah: " + hasil);
    System.out.println();

    System.out.println("--Iteratif--");
    hasil = totalIteratif(n);
    System.out.println("Total dari "+n+" angka yang dimasukkan adalah: " + hasil);
    System.out.println();
  }
  
  static int totalRekursif(int n) {
    if (n == 0) {
      return 0;
    } else {
      System.out.print("Masukkan angka ke-"+n+" : ");
      int nilai = sc.nextInt();
      return nilai + totalRekursif(n - 1);
    }
  }
  
  static int totalIteratif(int n) {
    int total = 0;
    for (int i = n; i >= 1; i--) {
      System.out.print("Masukkan angka ke-" + i + ": ");
      total += sc.nextInt();
    }
    return total;
  }
}          