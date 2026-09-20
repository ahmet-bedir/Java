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
equals() vs ==
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


*/
