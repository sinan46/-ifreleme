package sifreleme;

import java.util.Scanner;
/*Benim Sınav sorumda 2 ayrı sınıfta 2 tane şifreleme algoritması yapılması isteniyor. 
İçinde Polymorphism , Encapsulation ve Constructor kullanılması istenmektedir
*/
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sifreleme sifreleme = new Sifreleme();
        OnMetin bilgilendirme = new OnMetin();
        int secim = 0;
        do {
            secim = input.nextInt();

            if (secim == 1) {
                System.out.println(bilgilendirme.catchaBilgilendirme());
                sifreleme.sifre();
            } else if (secim == 2) {
                System.out.println(bilgilendirme.sezarBilgilendirme());
                input.nextLine();
                System.out.println("Metni Giriniz ==??");
                String metin = input.nextLine();
                System.out.println("Anahtar Sayısı ?");
                int adet = input.nextInt();
                sifreleme.sifre(metin, adet);
            } else if (secim == 0) {
                System.out.println("Program Sonlandırılıyor");
                break;
            } else {
                System.out.println("Lütfen 1-2-0 Seçeneğinden Birini Seçiniz");
            }
        } while (secim < 0 || secim > 2);

    }

}
