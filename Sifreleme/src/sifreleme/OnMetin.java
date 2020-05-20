
package sifreleme;


public class OnMetin {
    
 private String sezarBilgilendirme;
 private String capthcaBilgilendirme;
 private String firatBilgilendirme;
 private String metin;
 public String OnMetin;


   public  OnMetin(){
       System.out.println("Sifreleme Programına Hoş Geldiniz\n"
               + "********************************************\n"
               + "1-Capthca Şifreleme\n"
               + "2-Sezar Şifreleme\n"
               + "0-Çıkış\n"
               + "********************************************\n");
    }

     public String sezarBilgilendirme(){
     sezarBilgilendirme = "Bu şifreleme sisteminde girilen metin ,girilen sayıya göre ötelenmektedir.(İngilizce alfabeye göre) örnek > metin : abc    sayı : 3 >> Şifre def\n"
             + "********************************************\n";
     return sezarBilgilendirme;
     }
     public String catchaBilgilendirme(){
     capthcaBilgilendirme = "Bu şifreleme sisteminde random harf ve rakamlar karışık şekilde dizilmektedir.\n"
             + "********************************************\n";
     
     return capthcaBilgilendirme;
}
}

