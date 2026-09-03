public class OtomatikDonusum {
    public static void main(String[] args) {
        int tamSayi = 42;
        double ondalikli = tamSayi;  // Otomatik: int → double
        System.out.println(ondalikli);  // 42.0

        byte kucuk = 127;
        int buyuk = kucuk;  // Otomatik: byte → int
        System.out.println(buyuk);  // 127
    }
}
/*
Otomatik (Widening) Dönüşüm
Küçük tipten büyük tipe dönüşüm otomatik yapılır. Veri kaybı olmaz
byte → short → int → long → float → double
*/