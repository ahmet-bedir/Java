public class SayiSistemleri {
    public static void main(String[] args) {
        // Tam sayı literalleri
        int onluk = 2;
        int ikilik = 0b10;             // Binary (0b prefix)
        int sekizlik = 052;            // Octal (0 prefix)
        int onaltilik = 0x2A;          // Hex (0x prefix)

        System.out.println(onluk);     // 2
        System.out.println(ikilik);    // 2
        System.out.println(sekizlik);  // 42
        System.out.println(onaltilik); // 42
    }  
}
/*
Java 7'den itibaren okunabilirlik için alt çizgi kullanabilirsin:

int milyon = 1_000_000;
long krediKartiNo = 1234_5678_9012_3456L;
double pi = 3.14_15_92;

System.out.println(milyon);  // 1000000

Alt çizgiler derleme sırasında yok sayılır, sadece senin okumanı kolaylaştırır. Büyük sayılarda çok kullannışlıdır.

---
Literal Kısıtlamaları

Alt çizginin nereye koyabileceğin konusunda kurallar var:

// Geçerli
int a = 1_000_000;
int b = 0xFF_EC_DE;
int c = 0b1010_1010;

// Geçersiz — derleme hatası
// int d = _1000;     // Başında
// int e = 1000_;     // Sonunda
// float f = 3._14f;  // Noktanın yanında
// int g = 0_x1A;     // Prefix'in içinde
// long h = 123_L;    // L suffix'in yanında
*/
