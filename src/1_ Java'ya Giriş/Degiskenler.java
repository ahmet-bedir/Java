public class Degiskenler {
    public static void main(String[] args) {
        int yas = 25;              // Tam sayı
        double boy = 1.75;         // Ondalıklı sayı
        String isim = "Ali";       // Metin
        boolean ogrenciMi = true;  // Doğru/Yanlış
        char harf = 'A';           // Tek karakter

        System.out.println("İsim: " + isim);
        System.out.println("Yaş: " + yas);
        System.out.println("Boy: " + boy);
        System.out.println("Öğrenci mi: " + ogrenciMi);
        System.out.println("İlk harf: " + harf);
    }
}
/*
Primitive (İlkel) Veri Tipleri
Java'da 8 tane primitive veri tipi var.

---
Tam Sayı Tipleri
Tip	Boyut	Aralık	Kullanım
byte	1 byte	-128 ile 127	Çok küçük sayılar, dosya verisi
short	2 byte	-32,768 ile 32,767	Nadiren kullanılır
int	4 byte	≈ -2.1 milyar ile ≈ 2.1 milyar	En çok kullanılan tam sayı tipi
long	8 byte	≈ -9.2 × 10¹⁸ ile ≈ 9.2 × 10¹⁸   Çok büyük sayılar

byte kucukSayi = 100;
short ortaSayi = 30000;
int normalSayi = 2_000_000_000;    // Sayıların içinde _ (alt çizgi) kullanarak okunabilirliği artırabilirsin.
long buyukSayi = 9_000_000_000L;   // L soneki zorunlu!
        
---
Ondalıklı Sayı Tipleri
Tip	Boyut	Hassasiyet	Kullanım
float	4 byte	~7 basamak	Düşük hassasiyet yeterliyse
double	8 byte	~15 basamak	Varsayılan ondalıklı tip

float pi_float = 3.14159f;      // f soneki zorunlu!
double pi_double = 3.141592653589793;  // Varsayılan, sonek gerek yok

float kullanırken sonuna f eklemelisin. Eklemezsen Java onu double sayar ve float değişkenine double atayamazsın (daraltıcı dönüşüm hatası).

---
boolean ve char

boolean javaGüzelMi = true;
boolean zor = false;
char harf = 'J';
char rakam = '7';       // Bu bir sayı değil, karakter!
char unicode = '\u0041'; // Unicode ile 'A'

---
String: Metin Tipi

String bir primitive tip değildir — bir sınıftır (class). Ama o kadar sık kullanılır ki, primitive tipler gibi kolayca oluşturulabilir:

        // String oluşturma yolları
        String isim = "Ali";              // Literal (en yaygın)
        String soyisim = new String("Yılmaz"); // Constructor ile (gereksiz, kullanma)

        // String birleştirme
        String tamIsim = isim + " " + soyisim;
        System.out.println(tamIsim);  // Ali Yılmaz

        // String uzunluğu
        System.out.println("Uzunluk: " + tamIsim.length());  // 10

        // Büyük-küçük harf
        System.out.println(tamIsim.toUpperCase());  // ALI YILMAZ
        System.out.println(tamIsim.toLowerCase());  // ali yılmaz

        // Belirli karakteri alma (index 0'dan başlar)
        System.out.println("İlk harf: " + tamIsim.charAt(0));  // A
 
---
Var Anahtar Kelimesi (Java 10+)
Java 10'dan itibaren lokal değişkenlerde var kullanabilirsin. Java tipi otomatik anlar:

var isim = "Ali";       // Java anlar: bu String
        var yas = 25;           // Java anlar: bu int
        var boy = 1.75;         // Java anlar: bu double
        var aktif = true;       // Java anlar: bu boolean

 var x;          // HATA! Başlangıç değeri olmadan var kullanamassın
var y = null;   // HATA! null'dan tip çıkarılamaz

---
İsimlendirme Kuralları ve Gelenekleri
Java'da isimlendirme hem kurallar (rules — ihlal edersen derleme hatası) hem gelenekler (conventions — ihlal edersen kötü karşılanır) içerir.

Zorunlu Kurallar
- İsim harf, _ veya $ ile başlamalı (rakamla başlayamaz)

- İsimde boşluk olamaz

- Java'nın anahtar kelimeleri isim olarak kullanılamaz (int, class, public, if vb.)

- Büyük-küçük harf duyarlı (yas ve Yas farklı değişkenlerdir)

// DOĞRU
int yasam = 25;
int _gecici = 100;
int $dolar = 50;
int sayi123 = 42;

// HATALI
int 123sayi = 42;     // Rakamla başlayamaz
int benim sayim = 5;  // Boşluk olamaz
int class = 10;       // Anahtar kelime kullanılamaz

---
Gelenekler (Convention)
Bu geleneklere uymak zorunda değilsin ama uymazsan diğer Java geliştiricileri kodunu okuduğunda kaşlarını çatacak.

Öğe	Gelenek	Örnek
Değişken	camelCase	ogrenciYasi, toplamTutar
Metot	camelCase


*/