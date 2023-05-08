
package information.student.system;
import java.util.ArrayList;
import java.util.Scanner;
public class InformationStudentSystem {

   
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
    ArrayList<Ogrenci> ogrenciler = new ArrayList<Ogrenci>();

    System.out.print("Kaç öğrenci kaydedilecek? ");
    int ogrenciSayisi = input.nextInt();
    input.nextLine();

    for (int i = 0; i < ogrenciSayisi; i++) {
      System.out.print("\nÖğrenci adını girin: ");
      String ad = input.nextLine();
      System.out.print("Öğrenci soyadını girin: ");
      String soyad = input.nextLine();
      System.out.print("Öğrenci numarasını girin: ");
      int numara = input.nextInt();
      input.nextLine();
      System.out.print("Öğrenci bölümünü girin: ");
      String bolum = input.nextLine();
      System.out.print("Öğrenci sınıfını girin: ");
      int sinif = input.nextInt();
      input.nextLine();

      Ogrenci ogrenci = new Ogrenci(ad, soyad, numara, bolum, sinif);
      ogrenciler.add(ogrenci);
    }

    System.out.println("\nKaydedilen Öğrenci Bilgileri:");
    for (Ogrenci ogrenci : ogrenciler) {
      System.out.println("Ad: " + ogrenci.ad);
      System.out.println("Soyad: " + ogrenci.soyad);
      System.out.println("Numara: " + ogrenci.numara);
      System.out.println("Bölüm: " + ogrenci.bolum);
      System.out.println("Sınıf: " + ogrenci.sinif);
      System.out.println();
        
        
        
        
    }
    
}
     public static class Ogrenci {
    String ad;
    String soyad;
    int numara;
    String bolum;
    int sinif;

    public Ogrenci(String ad, String soyad, int numara, String bolum, int sinif) {
      this.ad = ad;
      this.soyad = soyad;
      this.numara = numara;
      this.bolum = bolum;
      this.sinif = sinif;
    }
  }
}
