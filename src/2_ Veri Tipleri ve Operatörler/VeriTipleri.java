public class VeriTipleri {
    public static void main(String[] args) {
        byte minByte = Byte.MIN_VALUE; // -128
        byte maxByte = Byte.MAX_VALUE; // 127
        
        short minShort = Short.MIN_VALUE; // -32,768
        short maxShort = Short.MAX_VALUE; // 32,767
        
        int minInt = Integer.MIN_VALUE; // -2,147,483,648
        int maxInt = Integer.MAX_VALUE; // 2,147,483,647
        
        System.out.println("Min byte: " + minByte);
        System.out.println("Max byte: " + maxByte);
        
        System.out.println("Min short: " + minShort);
        System.out.println("Max short: " + maxShort);
        
        System.out.println("Min int: " + minInt);
        System.out.println("Max int: " + maxInt);
        
        System.out.println("long  : " + Long.MIN_VALUE + " ~ " + Long.MAX_VALUE);
        System.out.println("float : " + Float.MIN_VALUE + " ~ " + Float.MAX_VALUE);
        System.out.println("double: " + Double.MIN_VALUE + " ~ " + Double.MAX_VALUE);
        
        // Boyutları byte cinsinden
        System.out.println("byte boyutu: " + Byte.BYTES + " byte");
        System.out.println("short boyutu: " + Short.BYTES + " byte");
        System.out.println("int boyutu: " + Integer.BYTES + " byte");
        System.out.println("long boyutu: " + Long.BYTES + " byte");
        System.out.println("float boyutu: " + Float.BYTES + " byte");
        System.out.println("double boyutu: " + Double.BYTES + " byte");
        System.out.println("char boyutu: " + Character.BYTES + " byte");
        System.out.println("boolean boyutu: " ++ " byte");
    }
}
/*
Primitive (İlkel) Veri Tipleri

Tip	    Boyut	Varsayılan	Min Değer	                    Max Değer	                Kullanım
byte	1 byte	0	        -128	                        127	                        Küçük sayılar, dosya verileri
short	2 byte	0	        -32,768	                        32,767	                    Orta küçük sayılar
int	    4 byte	0	        -2,147,483,648	                2,147,483,647	            Genel amaçlı tam sayı
long	8 byte	0L	        -9,223,372,036,854,775,808	    9,223,372,036,854,775,807	Çok büyük tam sayılar
float	4 byte	0.0f	    ≈ ±1.4 × 10⁻⁴⁵	                ≈ ±3.4 × 10³⁸	            Ondalıklı (düşük hassasiyet)
double	8 byte	0.0d	    ≈ ±4.9 × 10⁻³²⁴	                ≈ ±1.8 × 10³⁰⁸	            Ondalıklı (yüksek hassasiyet)
char	2 byte	'\u0000'	0	                            65,535	                    Tek karakter (Unicode)
boolean	~1 bit	false	    false	                        true	                    Doğru/yanlış


---
byte
1 byte = 8 bit. -128 ile 127 arası değer tutar. Genellikle dosya okuma/yazma işlemlerinde veya ağ programlamada karşılaşırsın.

byte yas = 25;
byte sicaklik = -10;
byte maxByte = 127;
// byte hata = 128; // HATA! byte max 127


---
short
2 byte yer kaplar. -32,768 ile 32,767 arası. Dürüst olalım: pratikte neredeyse hiç kullanmayız. int zaten her yerde iş görüyor.

short population = 30000;
short altitude = -500;

Eğer bellekten çok tasarruf etmen gereken büyük diziler varsa ve değerlerin bu aralıkta olduğunu biliyorsan short mantıklı olabilir. Ama çoğu zaman int kullanılır.


---
int
4 byte. Yaklaşık ±2.1 milyar aralık. Java'da tam sayı deyince akla ilk gelen tip bu. Sayaçlar, indeksler, döngüler — hep int.

int nufus = 85000000;
int bakiye = -15000;
int max = Integer.MAX_VALUE; // 2,147,483,647
int min = Integer.MIN_VALUE; // -2,147,483,648

System.out.println("Max int: " + max);
System.out.println("Min int: " + min);

💡 Java'da bir sayıyı yazarken (literal) varsayılan tip int'tir. Yani 42 yazdığında Java bunu int olarak algılar.


---
long
8 byte. Devasa sayılar için. Zaman damgaları (timestamp), dosya boyutları, büyük ID'ler — bunlar long ister.

long dunyaNufusu = 8000000000L; // Sonuna L koy!
long timestamp = System.currentTimeMillis();
long dosyaBoyutu = 5368709120L; // 5 GB in bytes

System.out.println("Şu anki zaman: " + timestamp);

⚠️ Dikkat: long literal yazarken sonuna L veya l eklemelisin. Küçük l sayı 1 ile karışabilir, bu yüzden büyük L kullan.

// long hata = 8000000000;  // HATA! int aralığını aşıyor
long dogru = 8000000000L;    // Sonuna L koyunca long olur


---
float
4 byte, yaklaşık 6-7 basamak hassasiyet. Grafik programlama, oyun geliştirme gibi alanlarda bellek önemliyse kullanılır.

float pi = 3.14f;          // Sonuna f koy!
float sicaklik = 36.6f;
float oran = 0.75f;

System.out.println("Pi: " + pi);

⚠️ Dikkat: Java'da ondalıklı sayılar varsayılan olarak double'dır. float kullanmak istiyorsan sonuna f eklemelisin.


---
double
8 byte, yaklaşık 15-16 basamak hassasiyet. Ondalıklı sayı gerektiğinde çoğu zaman double kullanırsın.

double pi = 3.141592653589793;
double maasBrut = 45750.50;
double avogadro = 6.022e23; // Bilimsel notasyon

System.out.println("Pi detaylı: " + pi);
System.out.println("Avogadro: " + avogadro);


---
float vs double — Hangisini Seçeyim?
Kısa cevap: double kullan. Daha hassas, modern donanımda performans farkı yok denecek kadar az.

float f = 0.1f + 0.2f;
double d = 0.1 + 0.2;

System.out.println("float:  " + f);  // 0.3
System.out.println("double: " + d);  // 0.30000000000000004

İkisi de tam doğru değil — bu ondalıklı sayıların doğasından kaynaklanan bir durum (IEEE 754). Ama double daha hassas olduğu için genellikle daha iyi sonuç verir.

💡 Para hesaplamalarında ne float ne double kullan! Kuruş kaybedersin. BigDecimal sınıfını kullan.


---
Karakter Tipi: char
2 byte. Tek bir Unicode karakteri tutar. Tek tırnak (') ile yazılır.

char harf = 'A';
char rakam = '7';
char turkce = 'Ş';
char emoji = '♥';
char unicode = '\u0041'; // 'A' nin Unicode karşılığı

System.out.println(harf);     // A
System.out.println(unicode);  // A

char aslında sayısal bir tiptir — 0 ile 65,535 arası bir tam sayı tutar. Bu sayı, Unicode tablosundaki karakterin numarasıdır.

char c = 'A';
int sayisal = c;
System.out.println(sayisal); // 65

char d = 66;
System.out.println(d); // B

Dikkat: char ile String farklı şeyler. char tek karakter, String karakter dizisi. char primitive, String nesne.

char c = 'A';       // Tek tırnak — char
String s = "A";     // Çift tırnak — String
// Bunlar aynı şey değil!


---
Mantıksal Tip: boolean
Sadece true veya false değeri alır. Koşullarda, kontrollerde, bayrak (flag) olarak kullanılır.

boolean aktif = true;
boolean ogrenci = false;
boolean yetiskin = (yas >= 18);

if (aktif) {
    System.out.println("Kullanıcı aktif");
}

Bellekte kaç byte kapladığı JVM implementasyonuna bağlı. Spesifikasyon "1 bit bilgi" diyor ama pratikte genellikle 1 byte kullanılır.

boolean sonuc = (10 > 5);      
boolean esit = (3 == 4);       
boolean degil = !true;         

System.out.println(sonuc);     // true
System.out.println(esit);      // false
System.out.println(degil);     // false


---
Varsayılan Değerler
Bir sınıfın alanı (field) olarak tanımlanan primitive değişkenlere otomatik varsayılan değer atanır:

public class VarsayilanDegerler {
    byte b;      // 0
    short s;     // 0
    int i;       // 0
    long l;      // 0L
    float f;     // 0.0f
    double d;    // 0.0d
    char c;      // '\u0000' (null karakter)
    boolean bo;  // false

    void yazdir() {
        System.out.println("byte: " + b);
        System.out.println("int: " + i);
        System.out.println("boolean: " + bo);
        System.out.println("char: [" + c + "]");
    }
}

⚠️ Ama lokal değişkenlere varsayılan değer atanmaz! Metot içinde tanımladığın bir değişkeni kullanmadan önce mutlaka değer atamalısın, yoksa derleme hatası alırsın.

void metot() {
    int x;
    // System.out.println(x); // DERLEME HATASI!
    
    int y = 0; // Bu doğru
    System.out.println(y); // OK
}


---
Bellekte Nasıl Saklanıyor?
Primitive tipler stack bellek alanında saklanır. Bu onları çok hızlı yapar.

int a = 5;
int b = a;  // a'nın DEĞERİ kopyalanır
b = 10;

System.out.println(a); // 5 — a değişmedi!
System.out.println(b); // 10

Primitive'lerde bir değişkeni diğerine atadığında değer kopyalanır. İki değişken birbirinden bağımsızdır. Bu, nesnelerden (referans tipleri) farklıdır — nesnelerde adres kopyalanır, bu yüzden biri değişince diğeri de etkilenebilir.


---
Primitive Tipler vs Referans Tipler

Java'da iki kategori veri tipi var: primitive ve referans. Bu farkı anlamak çok önemli çünkü davranışları tamamen farklı.

Özellik	                Primitive	            Referans (Nesne)
Bellekte	            Stack'te değer	        Stack'te adres, heap'te nesne
Varsayılan	            0, false, '\u0000'	    null
null olabilir mi?	    Hayır	                Evet
Metot çağrılabilir mi?	Hayır	                Evet
== ne yapar?	        Değer karşılaştırır	    Adres karşılaştırır

public class Java {
    public static void main(String[] args){
        // Primitive — değer kopyalanır
        int x = 10;
        int y = x;
        y = 20;
        System.out.println("x = " + x); // 10 — x değişmedi
        System.out.println("y = " + y); // 20
            
        // Referans — adres kopyalanır
        int[] dizi1 = {1, 2, 3};
        int[] dizi2 = dizi1;     // Aynı diziyi gösteriyor!
        System.out.println(dizi1[0]); // 1
            dizi2[0] = 99;
        System.out.println(dizi1[0]); // 99 — dizi1 de değişti!
    }
}

Bu fark özellikle metotlara parametre geçerken çok önemli hale gelir. Primitive geçtiğinde kopya gider — metot orijinali değiştiremez. Referans geçtiğinde adres gider — metot nesneyi değiştirebilir.

public static void artir(int sayi) {
    sayi++; // Kopya üzerinde çalışır
}

public static void main(String[] args) {
    int a = 5;
    artir(a);
    System.out.println(a); // 5 — değişmedi!
}


---
İkiye Tümleyen (Two's Complement)
Java'da negatif tam sayılar ikiye tümleyen (two's complement) yöntemiyle saklanır.

Bir byte için:

Pozitif sayılar normal ikili: 5 = 00000101

Negatif sayılar: tüm bitleri tersle, 1 ekle

- 5 = 00000101 → tersle: 11111010 → +1: 11111011 = -5

En soldaki bit (MSB) işaret biti: 0 = pozitif, 1 = negatif


byte b = 127;  // 01111111
b++;           // 10000000 = -128 (taşma!)
System.out.println(b); // -128

// Bu yüzden byte aralığı -128 ile 127
// 0 pozitif tarafta sayılır: 0..127 = 128 değer, -128..-1 = 128 değer
Bu, overflow'un neden "döndüğünü" açıklar. Max değerden bir fazlası, en küçük negatif sayıya denk gelir.


---
Tip Promosyonu (Type Promotion)
Farklı tipler bir arada kullanıldığında Java otomatik olarak küçük tipi büyüğe çevirir. Buna tip promosyonu denir.

 
byte a = 10;
byte b = 20;
// byte c = a + b; // HATA! a + b sonucu int'tir
int c = a + b;     // Doğru

short s = 100;
int i = 200;
long l = s + i;    // short + int = int, int → long

float f = 3.14f;
double d = f + 1;  // float + int = float, float → double

Promosyon kuralları:

- byte, short, char → aritmetik işlemde int'e yükseltilir

- Operandlardan biri long ise diğeri de long olur

- Operandlardan biri float ise diğeri de float olur

- Operandlardan biri double ise diğeri de double olur


char c = 'A';   // 65
int sonuc = c + 1; // 66 — char + int = int
System.out.println(sonuc);       // 66
System.out.println((char) sonuc); // B


---
Wrapper Sınıflarla Karşılaştırma
Her primitive tipin bir nesne karşılığı (wrapper class) vardır.


int primitiveInt = 42;           // Primitive — stack'te
Integer wrapperInt = 42;         // Nesne — heap'te (autoboxing)

// Primitive null olamaz
// int x = null; // DERLEME HATASI!

// Wrapper null olabilir
Integer y = null; // OK
// int z = y;     // NullPointerException! (unboxing)

Primitive	Wrapper
byte	    Byte
short	    Short
int	        Integer
long	    Long
float	    Float
double	    Double
char	    Character
boolean	    Boolean

Koleksiyonlar (List, Map vb.) primitive alamaz, wrapper gerekir:
List<Integer> sayilar = new ArrayList<>(); // int değil, Integer
sayilar.add(42); // Autoboxing: int → Integer
*/
