public class KarsilastirmaOperatorleri {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a == b: " + (a == b));  // false (eşit mi?)
        System.out.println("a != b: " + (a != b));  // true  (eşit değil mi?)
        System.out.println("a > b:  " + (a > b));   // false (büyük mü?)
        System.out.println("a < b:  " + (a < b));   // true  (küçük mü?)
        System.out.println("a >= b: " + (a >= b));  // false (büyük eşit mi?)
        System.out.println("a <= b: " + (a <= b));  // true  (küçük eşit mi?)
    }
}
/*
⚠️ Dikkat: Eşitlik kontrolü == (iki eşittir). Tek = atama operatörüdür.

if (x = 5) { ... }   // HATA! Bu atama, karşılaştırma değil.
 if (x == 5) { ... }  // DOĞRU
*/