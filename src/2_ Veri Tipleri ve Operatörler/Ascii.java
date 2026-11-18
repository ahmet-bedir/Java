public class Ascii {
    public static void main(String[] args) {
        // for (int i = 0; i < 256; i++) {
        // System.out.println(i + " : " + (char) i);
        // }

        char a = 'A';
        System.out.println(a + ": " + (int) a); // 65

        char sifir = '0';
        System.out.println(sifir + ": " + (int) sifir); // 48

        // Karakter aritmetiği
        char b = (char) ('A' + 1);
        System.out.println("A + 1 = " + b ); // 'B'
    }
}
