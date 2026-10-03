public class GirdiTemizleyici {
    public static String temizle(String girdi) {
        if (girdi == null) {
            return "";
        }
        
        return girdi
            .strip()                    // Baş/son boşluk
            .replaceAll("\\s+", " ")    // Çoklu boşluk → tek boşluk
            .trim();
    }
    
    public static void main(String[] args) {
        String kirli = "   Merhaba    Dünya   ";
        String temiz = temizle(kirli);
        System.out.println("[" + temiz + "]"); // [Merhaba Dünya]
    }
}