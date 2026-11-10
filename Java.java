public class Java {
    public static void main(String[] args) {
        
        String metin = "Java progr   amlama  dili "
            + ". Java platform bağımsız bir dildir.";
            
        System.out.println(metin);
        
        // Kelime sayısı
        String[] kelimeler = metin.split("\\s+");
        for(String kelime : kelimeler){
            System.out.println(kelime);
        }
        System.out.println("Kelime sayısı: " + kelimeler.length);
    }
}