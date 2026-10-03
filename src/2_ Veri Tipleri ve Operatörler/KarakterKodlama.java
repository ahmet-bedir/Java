public class KarakterKodlama {
    public static void main(String[] args){
        char a = 'A';
        System.out.println((int) a); // 65

        char sifir = '0';
        System.out.println((int) sifir); // 48

        // Karakter aritmetiği
        char b = (char) ('A' + 1);
        System.out.println(b); // 'B'
    }
}