public class VeriTipiString {
    public static void main(String[] args) {
        String c = new String("Merhaba");
        String d = new String("Merhaba");

        System.out.println(c == d);      // false — farklı nesneler!
        System.out.println(c.equals(d)); // true — içerik aynı
    }
}
/*
String Nedir?
String, karakter dizisi tutan bir sınıftır (class). Primitive tip değildir — bir nesnedir. Ama Java onu o kadar özel tutar ki, neredeyse primitive gibi kullanırsın.

String isim = "Ahmet";           // Literal ile oluşturma
String soyisim = new String("Yılmaz"); // new ile oluşturma (önerilmez)

Çift tırnak arasına yazdığın her şey bir String literal'dir. Java bunu arka planda bir String nesnesi olarak oluşturur.

---
String Immutable'dır — Değiştirilemez
String nesnesi oluşturulduktan sonra içeriği asla değişmez.


String mesaj = "Merhaba";
mesaj = mesaj + " Dünya";

System.out.println(mesaj); // "Merhaba Dünya"

Burada "Merhaba" nesnesi değişmedi. Java yeni bir "Merhaba Dünya" nesnesi oluşturdu ve mesaj değişkeni artık bu yeni nesneye işaret ediyor. Eski "Merhaba" nesnesi bellekte öylece duruyor (garbage collector temizleyene kadar).


String s = "Java";
String s2 = s.toUpperCase(); // Yeni nesne oluşur

System.out.println(s);  // "Java" — orijinal değişmedi!
System.out.println(s2); // "JAVA" — yeni nesne

💡 String üzerinde çağırdığın her metot (toUpperCase, trim, replace vb.) orijinal String'i değiştirmez, yeni bir String döner.

---
String Pool — Java'nın Akıllı Bellek Yönetimi
Java, String literal'lerini özel bir bellek alanında saklar: String Pool. Aynı içeriğe sahip iki literal aynı nesneyi paylaşır.

String a = "Merhaba";
String b = "Merhaba";

System.out.println(a == b); // true — aynı nesne!

İkisi de pool'daki aynı "Merhaba" nesnesine işaret ediyor. Bu, bellek tasarrufu sağlar.

Ama new ile oluşturduğunda farklı:

String c = new String("Merhaba");
String d = new String("Merhaba");

System.out.println(c == d);      // false — farklı nesneler!
System.out.println(c.equals(d)); // true — içerik aynı

new her zaman heap'te yeni bir nesne oluşturur, pool'u kullanmaz.

---
`equals()` vs `==`
İki String'in içeriğini karşılaştırmak istiyorsan `equals()` kullan, == değil.

== : İki referansın aynı nesneyi gösterip göstermediğini kontrol eder

equals() : İki String'in içeriğinin aynı olup olmadığını kontrol eder


String s1 = "Java";
String s2 = "Java";
String s3 = new String("Java");

System.out.println(s1 == s2);      // true (ikisi de pool'da)
System.out.println(s1 == s3);      // false (s3 heap'te)
System.out.println(s1.equals(s3)); // true (içerik aynı)

⚠️ Altın Kural: String karşılaştırmasında her zaman `equals()` kullan. == sadece pool'daki literal'ler arasında doğru çalışır — bu güvenilir değil.


// Doğru yol
if (isim.equals("Ahmet")) {
    System.out.println("Hoş geldin Ahmet!");
}

// Daha güvenli yol — NullPointerException'dan korunur
if ("Ahmet".equals(isim)) {
    System.out.println("Hoş geldin Ahmet!");
}

İkinci yöntemde isim null olsa bile hata almassın, çünkü "Ahmet" literal'i null olamaz.


---
equalsIgnoreCase — Büyük/Küçük Harf Duyarsız

String girdi = "java";
System.out.println(girdi.equals("Java"));            // false
System.out.println(girdi.equalsIgnoreCase("Java"));  // true

Kullanıcı girdisi alırken çok işe yarar. Kullanıcı "JAVA", "Java" veya "java" yazabilir — hepsini yakala.

---
Sık Kullanılan String Metotları

---
length() — Uzunluk

String s = "Merhaba";
System.out.println(s.length()); // 7

Boş String ile null karıştırma:

String bos = "";
String nul = null;

System.out.println(bos.length()); // 0
// System.out.println(nul.length()); // NullPointerException!

---
charAt(index) — Belirli Karakter

String s = "Java";
System.out.println(s.charAt(0)); // 'J'
System.out.println(s.charAt(3)); // 'a'
// s.charAt(4) → StringIndexOutOfBoundsException!

İndeks 0'dan başlar, length() - 1'e kadar gider.

---
substring() — Alt Dize

String s = "Merhaba Dünya";
System.out.println(s.substring(8));     // "Dünya"
System.out.println(s.substring(0, 7));  // "Merhaba"

substring(baslangic, bitis) — başlangıç dahil, bitiş hariç.

---
indexOf() ve contains() — Arama

String s = "Java programlama dili";

System.out.println(s.indexOf("program"));  // 5
System.out.println(s.indexOf("Python"));   // -1 (bulunamadı)
System.out.println(s.contains("Java"));    // true
System.out.println(s.contains("java"));    // false (büyük/küçük harf duyarlı)

---
split() — Bölme

String csv = "Ali,Veli,Ayşe,Fatma";
String[] isimler = csv.split(",");

for (String isim : isimler) {
    System.out.println(isim);
}
// Ali
// Veli
// Ayşe
// Fatma


String metin = "Merhaba   Dünya";
String[] kelimeler = metin.split("\\s+"); // Bir veya daha fazla boşluk

System.out.println(kelimeler.length); // 2

split() parametre olarak regex alır. Bu yüzden nokta ile bölmek istersen "\\." yazmalısın — çünkü regex'te . "herhangi bir karakter" demek.

---
trim() ve strip() — Boşluk Temizleme

String s = "   Merhaba   ";
System.out.println("[" + s.trim() + "]");  // [Merhaba]
System.out.println("[" + s.strip() + "]"); // [Merhaba] (Java 11+)

// Sadece baş veya son
System.out.println("[" + s.stripLeading() + "]");  // [Merhaba   ]
System.out.println("[" + s.stripTrailing() + "]");  // [   Merhaba]

trim() sadece ASCII boşluklarını temizler. strip() (Java 11+) Unicode boşluk karakterlerini de temizler. Modern Java'da strip() tercih et.

---
replace() — Değiştirme

String s = "Java çok zor";
String yeni = s.replace("zor", "kolay");
System.out.println(yeni); // "Java çok kolay"
System.out.println(s);    // "Java çok zor" — orijinal değişmedi!

// Tüm geçenleri değiştirir
String telefon = "0532-123-45-67";
String temiz = telefon.replace("-", "");
System.out.println(temiz); // "05321234567"

---
toUpperCase() ve toLowerCase()

String s = "Java";
System.out.println(s.toUpperCase()); // "JAVA"
System.out.println(s.toLowerCase()); // "java"

⚠️ Türkçe tuzağı: "title".toUpperCase() → "TITLE", ama Türkçe locale'de "ı".toUpperCase() → "I" değil, "I" olmalı. Locale belirtmen gerekebilir:


String s = "sığır";
System.out.println(s.toUpperCase(new java.util.Locale("tr", "TR")));
// "SIĞIR" — Türkçe İ/I kuralına uygun


---
String.format() — Biçimlendirme

String ad = "Ahmet";
int yas = 25;
double not_ = 3.75;

String mesaj = String.format("Ad: %s, Yaş: %d, Not: %.2f", ad, yas, not_);
System.out.println(mesaj); // Ad: Ahmet, Yaş: 25, Not: 3.75

Format	Açıklama	        Örnek
%s	    String	            "Ahmet"
%d	    Tam sayı	        42
%f	    Ondalıklı	        3.140000
%.2f	2 basamak ondalık	3.14
%n	    Yeni satır	        (satır sonu)
%b	    Boolean	            true

Java 15+ ile text block ve formatted() metodu:

String ad = "Ali";

String html = """
    <html>
        <body>
            <p>Merhaba %s!</p>
        </body>
    </html>
    """.formatted(ad);

System.out.println(html);


*/
