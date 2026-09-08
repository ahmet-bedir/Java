public class OperatorOnceligi {
    public static void main(String[] args) {
        // Çarpma toplamadan önce gelir
        int sonuc1 = 2 + 3 * 4;
        System.out.println("2 + 3 * 4 = " + sonuc1);  // 14 (3*4=12, 2+12=14)

        // Parantezle değiştirebilirsin
        int sonuc2 = (2 + 3) * 4;
        System.out.println("(2 + 3) * 4 = " + sonuc2); // 20

        // Karmaşık ifade
        boolean sonuc3 = 5 > 3 && 10 < 20 || false;
        System.out.println("5 > 3 && 10 < 20 || false = " + sonuc3); // true
    }
}
/*
Öncelik	Operatör	Açıklama
1 (En yüksek)	()	Parantez
2	++, --, !	Tekli operatörler
3	*, /, %	Çarpma, bölme, mod
4	+, -	Toplama, çıkarma
5	<, >, <=, >=	Karşılaştırma
6	==, !=	Eşitlik
7	&&	Mantıksal VE
8	`		`	Mantıksal VEYA
9 (En düşük)	=, +=, -= ...	Atama

💡 İpucu: Emin olmadığın yerde parantez kullan. Hem kodu daha okunabilir yapar hem de beklenmedik sonuçları önler.
a + b * c yerine a + (b * c) yazmak açıklığı artırır.
*/