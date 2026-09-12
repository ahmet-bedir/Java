import java.util.Scanner;

public class Selamlama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Hoş Geldiniz! ===");
        System.out.println();

        System.out.print("Adınız: ");
        String ad = scanner.nextLine();

        System.out.print("Soyadınız: ");
        String soyad = scanner.nextLine();

        System.out.print("Doğum yılınız: ");
        int dogumYili = Integer.parseInt(scanner.nextLine());

        int yas = 2026 - dogumYili;

        System.out.println();
        System.out.println("=== Bilgileriniz ===");
        System.out.printf("Ad Soyad: %s %s%n", ad, soyad);
        System.out.printf("Yaş: %d%n", yas);

        if (yas < 18) {
            System.out.println("Henüz reşit değilsiniz.");
        } else if (yas < 65) {
            System.out.println("Çalışma çağındasınız.");
        } else {
            System.out.println("Emeklilik hakkınız var.");
        }

        scanner.close();
    }
}