import java.util.Scanner;  // Scanner'ı import et

public class UygScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Klavyeyi dinlemeye başla

        System.out.print("Adın ne? ");  // Kullanıcıya sor
        String isim = scanner.nextLine();  // Cevabı oku

        System.out.println("Merhaba, " + isim + "!");  // Cevabı kullan

        scanner.close();  // İşin bitince kapat
    }
}
/*
- `import java.util.Scanner;` → Scanner sınıfını programa dahil ettik. Bu satır olmadan Scanner kullanamazsın.

- `Scanner scanner = new Scanner(System.in);` → Yeni bir Scanner nesnesi oluşturdum. System.in = klavye girdisi.

- `System.out.print("Adın ne? ");` → println değil print kullandık — böylece kullanıcı aynı satırda yazar.

- `scanner.nextLine();` → Kullanıcı bir satır yazıp Enter'a basana kadar bekler, sonra yazdığını String olarak döndürür.

- `scanner.close();` → Scanner'ı kapattık. Kaynak sızıntısını önler.

---
Scanner Metodları

Metod	        Ne Okur	                Dönüş Tipi	Örnek Girdi
nextLine()	    Satırın tamamını	    String	    Merhaba Dünya
next()	        İlk kelimeyi	        String	    Merhaba
nextInt()	    Tam sayı	            int	        42
nextDouble()	Ondalıklı sayı	        double	    3.14
nextLong()	    Büyük tam sayı	        long	    9000000000
nextFloat()     Ondalıklı sayı	        float	    3.14
nextBoolean()	Boolean	                boolean	    true
hasNextInt()	Sıradaki int mi?	    boolean	    —
hasNextLine()	Başka satır var mı?	    boolean 	—

örnek:

import java.util.Scanner;

public class FarkliTipler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınız: ");
        String ad = scanner.nextLine();

        System.out.print("Yaşınız: ");
        int yas = scanner.nextInt();

        System.out.print("Boyunuz (m): ");
        double boy = scanner.nextDouble();

        System.out.println("\n--- Bilgileriniz ---");
        System.out.println("Ad: " + ad);
        System.out.println("Yaş: " + yas);
        System.out.println("Boy: " + boy + " m");

        scanner.close();
    }
}

---
import java.util.Scanner;

public class NextVsNextLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("next() ile oku: ");
        String kelime = scanner.next();       // Sadece ilk kelimeyi okur
        System.out.println("Okunan: " + kelime);

        scanner.nextLine();  // Kalan kısmı temizle (nextInt(), nextDouble() gibi metodlar sayıyı okur ama Enter karakterini (\n) okumaz. Bu karakter buffer'da kalır. Hemen arkasından nextLine() çağırırsan, nextLine() buffer'daki \n'i okur ve boş string döndürür)

        System.out.print("nextLine() ile oku: ");
        String satir = scanner.nextLine();    // Tüm satırı okur
        System.out.println("Okunan: " + satir);

        scanner.close();
    }
}
next() boşluğa kadar okur (tek kelime)
nextLine() Enter'a kadar okur (tüm satır).

---
Girdi Doğrulama
Sayı beklediğin yere metin girilmesini hasNextInt() gibi metodlarla kontrol edebilirsin:

import java.util.Scanner;

public class GirdiDogrulama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tam sayı girin: ");

        if (scanner.hasNextInt()) {
            int sayi = scanner.nextInt();
            System.out.println("Girdiğiniz sayı: " + sayi);
        } else {
            System.out.println("Bu bir tam sayı değil!");
        }

        scanner.close();
    }
}
*/