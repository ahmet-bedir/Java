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

 */