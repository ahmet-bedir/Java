public class ArtirmaAzaltma {
    public static void main(String[] args) {
        int x = 5;

        x++;  // x = x + 1 → 6
        System.out.println("x++ → " + x);  // 6

        x--;  // x = x - 1 → 5
        System.out.println("x-- → " + x);  // 5

        // Prefix vs Postfix farkı
        int a = 10;
        System.out.println("a++: " + a++);  // önce 10 yazdırır, SONRA artırır
        System.out.println("a şimdi: " + a); // 11

        int b = 10;
        System.out.println("++b: " + (++b));  // ÖNCE artırır, 11 yazdırır
    }
}
// a++ (postfix): Önce mevcut değeri kullan, sonra artır.
// ++a (prefix): Önce artır, sonra değeri kullan.