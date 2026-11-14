public class MetinIstatistikPc {
    public static void main(String[] args) {
        
        String metin = "Java programlama dili. Java programlama dili? Java programlama dili!" + "Java programlama dili.";
            
        System.out.println(metin);
        
        
        // Kelime sayısı
        System.out.println("\n=== Kelimeler ===");
        
        String[] kelimeler = metin.split("\\s+");
        
        for (String kelime : kelimeler){
            System.out.println(kelime);
        }
        
        System.out.println("\nKelime sayısı: " + kelimeler.length);
        
        
        // Cümle sayısı
        String[] cumleler = metin.split("[.!?]+");
        
        System.out.println("\n=== Cümleler ===");
        
        for (String cumle : cumleler){
            System.out.println(cumle);
        }
        
        System.out.println("\nCümle sayısı: " + cumleler.length);
        
        
        // En uzun kelime
        String enUzun = "";
        for (String kelime : kelimeler) {
            if (kelime.length() > enUzun.length()) {
                enUzun = kelime;
            }
        }
        
        System.out.println("\nEn uzun kelime: " + enUzun);
        
        
        // En kısa kelime copilot devreye gir
        String enKisa = kelimeler[0];
        for (String kelime : kelimeler) {
            if (enKisa.length() > kelime.length()) {
                enKisa = kelime;
            }
        }
        
        System.out.println("En kısa kelime: " + enKisa);
        
    }
}


