import java.util.Scanner;

public class GirdiTemizleyici {
    public static void main(String[] args) {
        String girdi = "   Java    Programlama   ";
        System.out.println("=== Değişken Kullanarak ===");
        System.out.println("İlk Hali\n[" + girdi + "]\n");
        
        String temiz = girdi
            .strip()                    // Baş/son boşluk
            .replaceAll("\\s+", " ")    // Çoklu boşluk → tek boşluk
            .trim();
        System.out.println("Son Hali\n[" + temiz + "]"); // [Java Programlama]
        
        
        System.out.println("\n\n=== Kullanıcı Girişi ===");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Giriş: ");
        String girdi2 = scanner.nextLine();
        System.out.println("İlk Hali\n[" + girdi2 + "]");
        if (girdi2.isBlank()) {
            System.out.println("Sadece Boşluk!\n");
        }
        
        String temiz2 = girdi2
            .strip().replaceAll("\\s+", " ").trim();
        System.out.println("Son Hali\n[" + temiz2 + "]");
        
        scanner.close();         
    }
}