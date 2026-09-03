public class AritmetikOperatorler {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        System.out.println("a + b = " + (a + b));   // 22 (toplama)
        System.out.println("a - b = " + (a - b));   // 12 (çıkarma)
        System.out.println("a * b = " + (a * b));   // 85 (çarpma)
        System.out.println("a / b = " + (a / b));   // 3  (bölme — tam sayı!)
        System.out.println("a % b = " + (a % b));   // 2  (mod — kalan)
    }
}
/*
⚠️ Dikkat: İki int bölünürse sonuç da int olur. 17 / 5 = 3, not 3.4! Ondalıklı sonuç istiyorsan en az bir taraf double olmalı:

System.out.println(17.0 / 5);   // 3.4
System.out.println((double) 17 / 5); // 3.4 (casting ile)
*/