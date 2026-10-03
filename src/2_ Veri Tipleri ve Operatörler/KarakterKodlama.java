public class KarakterKodlama {
    public static void main(String[] args){
        char a = 'A';
        System.out.println((int) a); // 65

        char sifir = '0';
        System.out.println((int) sifir); // 48

        // Karakter aritmetiği
        char b = (char) ('A' + 1);
        System.out.println(b); // 'B'
        
        // UTF-8 Encoding Detayı
        // 'A' (U+0041) → 1 byte: 01000001
            // 'ş' (U+015F) → 2 byte: 11000101 10011111
            // '中' (U+4E2D) → 3 byte: 11100100 10111000 10101101
            
            char a = 'A';
            char s = 'ş';
            char c = '中';
            
            System.out.println(a.getBytes("UTF-8").length); // 1
            System.out.println(s.getBytes("UTF-8").length); // 2
            System.out.println(c.getBytes("UTF-8").length); // 3
    }
}