import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç ders var? ");
        int dersSayisi = Integer.parseInt(scanner.nextLine());

        double toplam = 0;

        for (int i = 1; i <= dersSayisi; i++) {
            System.out.printf("%d. dersin notu (0-100): ", i);
            double not_ = Double.parseDouble(scanner.nextLine());
            toplam += not_;
        }

        double ortalama = toplam / dersSayisi;

        System.out.println("\n=== SONUÇ ===");
        System.out.printf("Toplam: %.1f%n", toplam);
        System.out.printf("Ortalama: %.2f%n", ortalama);

        // Harf notu
        String harfNotu;
        if (ortalama >= 90) harfNotu = "AA";
        else if (ortalama >= 80) harfNotu = "BA";
        else if (ortalama >= 70) harfNotu = "BB";
        else if (ortalama >= 60) harfNotu = "CB";
        else if (ortalama >= 50) harfNotu = "CC";
        else harfNotu = "FF";

        System.out.println("Harf Notu: " + harfNotu);

        if (ortalama >= 50) {
            System.out.println("Durum: GEÇTİ ✓");
        } else {
            System.out.println("Durum: KALDI ✗");
        }

        scanner.close();
    }
}