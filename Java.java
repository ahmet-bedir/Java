public class Java {
    public static void main(String[] args) {
        
        String metin = "Java programlama dili. Java programlama dili? Java programlama dili!" + "Java programlama dili.";
            
        System.out.println(metin);
        
        // Kelime sayısı
        System.out.println("\n=== Kelimeler ===");
        
        String[] kelimeler = metin.split("\\s+");
        
        for(String kelime : kelimeler){
            System.out.println(kelime);
        }
        
        System.out.println("\nKelime sayısı: " + kelimeler.length);
        
        
        // Cümle sayısı
        String[] cumleler = metin.split("[.!?]+");
        
        System.out.println("\n=== Cümleler ===");
        
        for(String cumle : cumleler){
            System.out.println(cumle);
        }
        
        System.out.println("\nCümle sayısı: " + cumleler.length);
    }
}