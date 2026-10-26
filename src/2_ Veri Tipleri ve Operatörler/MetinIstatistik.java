public class MetinIstatistik {
    public static void main(String[] args) {
        String metin = "Java programlama dili 1995 yılında Sun Microsystems "
            + "tarafından geliştirildi. Java platform bağımsız bir dildir.";
        
        // Kelime sayısı
        String[] kelimeler = metin.split("\\s+");
        System.out.println("Kelime sayısı: " + kelimeler.length);
        
        // Karakter sayısı (boşluk hariç)
        long karakterSayisi = metin.chars()
            .filter(c -> c != ' ')
            .count();
        System.out.println("Karakter (boşluksuz): " + karakterSayisi);
        
        // Cümle sayısı
        String[] cumleler = metin.split("[.!?]+");
        System.out.println("Cümle sayısı: " + cumleler.length);
        
        // En uzun kelime
        String enUzun = "";
        for (String kelime : kelimeler) {
            if (kelime.length() > enUzun.length()) {
                enUzun = kelime;
            }
        }
        System.out.println("En uzun kelime: " + enUzun);
        
        // Belirli kelime kaç kez geçiyor
        String aranan = "Java";
        int index = 0;
        int sayac = 0;
        while ((index = metin.indexOf(aranan, index)) != -1) {
            sayac++;
            index += aranan.length();
        }
        System.out.println("'" + aranan + "' kaç kez: " + sayac);
    }
}
